package com.heeexy.example.util;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

public class GoodConnectUrl {
    private String paramjson;
    private String method;

    public String getParamjson() {
        return paramjson;
    }

    public void setParamjson(String paramjson) {
        this.paramjson = paramjson;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String parseConnect() {
        try {
            URL wsUrl = new URL("https://oms.goodcang.net/default/svc/web-service");
            HttpURLConnection conn = (HttpURLConnection) wsUrl.openConnection();

            conn.setDoInput(true);
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");

            OutputStream os = conn.getOutputStream();
            String soap = "<?xml version=\"1.0\" encoding=\"utf-8\"?>" +
                    "<SOAP-ENV:Envelope xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ns1=\"http://www.example.org/Ec/\">" +
                    "    <SOAP-ENV:Body>" +
                    "        <ns1:callService>" +
                    "            <paramsJson>" + paramjson + "</paramsJson>" +
                    "            <appToken>c9f7884bac49d8ad58a03d9fba136270</appToken>" +
                    "            <appKey>7b8116c30053ed1068fb4ca4def2c118</appKey>" +
                    "            <service>" + method + "</service>" +
                    "        </ns1:callService>" +
                    "    </SOAP-ENV:Body>" +
                    "</SOAP-ENV:Envelope>";
            os.write(soap.getBytes());

            InputStream is = conn.getInputStream();

            byte[] b = new byte[1024];
            int len = 0;
            StringBuilder s = new StringBuilder();
            while ((len = is.read(b)) != -1) {
                String ss = new String(b, 0, len, "UTF-8");
                s.append(ss);
            }
            is.close();
            os.close();
            conn.disconnect();
            return parse(s.toString());
        } catch (IOException e) {
            System.out.println(paramjson);
            e.printStackTrace();
        }
        return null;
    }

    public static String parse(String xml) {
        Document doc = null;
        try {
            doc = DocumentHelper.parseText(xml); // 将字符串转为XML
            Element rootElt = doc.getRootElement(); // 获取根节点smsReport
            Iterator iters = rootElt.elementIterator(); // 获取根节点下的子节点sms
            while (iters.hasNext()) {
                Element recordEle1 = (Element) iters.next();
                Iterator iter = recordEle1.elementIterator();
                while (iter.hasNext()) {
                    Element recordEle = (Element) iter.next();
                    Iterator iter2 = recordEle.elementIterator();
                    while (iter2.hasNext()) {
                        Element responseElem = (Element) iter2.next();
                        return responseElem.getText();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
