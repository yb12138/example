package com.heeexy.example.util.http;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.EcOrder;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

import java.io.IOException;
import java.util.List;

public class EcApiClient {
    private String ebDomain = "http://joinfun-eb.eccang.com/default/svc-open/web-service-v2";
    private String wmsDomain = "http://kaifa.ez-wms.com";
    private static String userName = "k.wang";
    private static String userPass = "wangkai95733";

    /**
     * 查询订单列表示例
     */
    public List<EcOrder> getOrderList(String start,String end,int page) {
        String service = "getOrderList";
        String params = "{\"page\":"+page+",\"pageSize\":100,\"getDetail\":0,\"condition\":{\"createdDateAfter\":\""+start+"\",\"createdDateBefore\":\""+end+"\"}}";
        System.out.println(params);
        JSONObject result = soapRequest(service, "eb", params);
        String data = result.getString("data");
        List<EcOrder> ecOrders=JSONArray.parseArray(data, EcOrder.class);
        if (ecOrders.size()==100){
            ecOrders.addAll(getOrderList(start,end,page+1));
        }
        return ecOrders;
    }

    /**
     * 接口调用示例
     */
    public void demo() {
        String service = "demo";
        String params = "{\"param1\":\"paramdata\",\"param2\":\"paramdata\"}";
        JSONObject result = soapRequest(service, "eb", params);
        System.out.println(result);
    }

    /**
     * Soap请求
     *
     * @param service    方法名
     * @param systemCode 所属系统代码
     * @param params     请求参数
     * @return array
     */
    public JSONObject soapRequest(String service, String systemCode, String params) {
        JSONObject result = new JSONObject();
        systemCode = systemCode.toUpperCase();
        if (!systemCode.equals("EB") && !systemCode.equals("WMS")) {
            result.put("message", "systemCode Error");
            return result;
        }
        String domain = systemCode.equals("EB") ? ebDomain : wmsDomain;
        if (domain.isEmpty()) {
            result.put("message", "domain Empty");
            return result;
        }
        domain = domain.replaceAll("/+$", "\"");
        String wsdl = domain + "/default/svc-open/web-service-v2";
        String method = "callService";
        StringBuffer sendSoapString = getSendSoapString(params, service);
        try {
            String ret = getWebServiceAndSoap(wsdl, method, service, sendSoapString);
            Document doc = Jsoup.parse(ret);
            String json = doc.select("response").text();
            return JSON.parseObject(json);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param service 方法名
     * @param params  请求参数
     * @return StringBuffer
     */
    private static StringBuffer getSendSoapString(String params, String service) {
        // TODO Auto-generated method stub
        StringBuffer sendSoapString = new StringBuffer();
        sendSoapString.append("<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.example.org/Ec/\">");
        sendSoapString.append("   <soapenv:Body>");
        sendSoapString.append("      <ns1:callService>");
        sendSoapString.append("        <paramsJson>" + params + "</paramsJson>");
        sendSoapString.append("         <userName>" + userName + "</userName>");
        sendSoapString.append("         <userPass>" + userPass + "</userPass>");
        sendSoapString.append("         <service>" + service + "</service>");
        sendSoapString.append("      </ns1:callService>");
        sendSoapString.append("   </soapenv:Body>");
        sendSoapString.append("</soapenv:Envelope>");
        return sendSoapString;
    }

    /**
     * 远程访问SOAP协议接口
     *
     * @param url： 服务接口地址
     * EB接入地址地址路径：http://xxx-EB.xxx.com/default/svc-open/web-service-v2
     * WMS接入地址地址路径：http://xxx.xxx.com/default/svc-open/web-service-v2
     * @param isClass：接口类名
     * @param isMethod： 接口方法名
     * @param sendSoapString： soap协议xml格式访问接口
     * @return  soap协议xml格式
     * @备注：有四种请求头格式1、SOAP 1.1； 2、SOAP 1.2 ； 3、HTTP GET； 4、HTTP POST
     */
    private static String getWebServiceAndSoap(String url, String isClass, String isMethod, StringBuffer sendSoapString) throws IOException {
        String soap = sendSoapString.toString();
        if (soap == null) {
            return null;
        }
        URL soapUrl = new URL(url);
        URLConnection conn = soapUrl.openConnection();
        conn.setUseCaches(false);
        conn.setDoInput(true);
        conn.setDoOutput(true);
        conn.setRequestProperty("Content-Length",
                Integer.toString(soap.length()));
        conn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
        // 调用的接口方法是
        conn.setRequestProperty(isClass, isMethod);
        OutputStream os = conn.getOutputStream();
        OutputStreamWriter osw = new OutputStreamWriter(os, "utf-8");
        osw.write(soap);
        osw.flush();
        osw.close();
        // 获取webserivce返回的流
        InputStream is = conn.getInputStream();
        BufferedReader in=new BufferedReader(new InputStreamReader(is,"utf-8"));
        String line;
        StringBuilder str= new StringBuilder();
        while ((line = in.readLine()) != null) {
            str.append(line);
        }
        return str.toString();
    }


}
