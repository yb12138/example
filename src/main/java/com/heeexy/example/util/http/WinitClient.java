package com.heeexy.example.util.http;

import com.heeexy.example.model.StorageReponse;
import com.heeexy.example.winit.constants.RequestParam;
import com.heeexy.example.winit.model.RequestMsg;
import com.heeexy.example.winit.utils.DateUtil;
import com.heeexy.example.winit.utils.SignUtil;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class WinitClient {
    private WebClient webClient = WebClient.builder()
            .baseUrl(RequestParam.URL)
            .defaultHeader("Content-Type", "application/json")
            .build();

    public StorageReponse post(RequestMsg requestMsg) {
        // 1.构建RequestMsg系统级别参数
        setBaseRequestInfo(requestMsg);
        // 2.构建RequestMsg调用的用户签名
        setRequestUserSign(requestMsg, "911C248A7BAA5913931C2656F056FF46");
        // 3.构建RequestMsg调用的应用签名
        // 此处clientSecret即创建应用时系统分配的client_secret
        setRequestClientSign(requestMsg, RequestParam.CLIENT_SECRET);
        Mono<StorageReponse> response = webClient.post()
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(requestMsg))
                .retrieve()
                .bodyToMono(StorageReponse.class).timeout(Duration.of(10, ChronoUnit.SECONDS));
        return response.block();
    }

    /**
     * 构建请求的系统级别参数
     *
     * @param requestMsg
     */
    protected void setBaseRequestInfo(RequestMsg requestMsg) {
        // appKey:卖家账号
        requestMsg.setApp_key(RequestParam.USERNAME);
        // format:格式，默认json格式
        requestMsg.setFormat("json");
        // version:版本，默认1.0
        requestMsg.setVersion("1.0");
        // sign_method:加密方式，默认md5
        requestMsg.setSign_method("md5");
        // timestamp:调用时间戳，系统当前时间，格式：yyyy-MM-dd HH:mm:ss
        requestMsg.setTimestamp(DateUtil.parse2String(new Date(), DateUtil.FULL_DATE_STRING));
        // language:语言，默认：zh_CN
        requestMsg.setLanguage("zh_CN");
        // platform:平台。与Client_id一一对应，即应用创建时填写的CODE，推荐使用公司英文简称或中文汉语首字母组合，大写
        requestMsg.setPlatform(RequestParam.CLIENT_CODE);
        // client_id:即应用的key，由注册应用时系统自动生成，不可修改
        requestMsg.setClient_id(RequestParam.CLIENT_ID);
    }

    /**
     * 生成用户签名sign
     *
     * @param requestMsg
     * @param token
     */
    protected void setRequestUserSign(RequestMsg requestMsg, String token) {
        String sign = SignUtil.getSign(requestMsg, token);
        requestMsg.setSign(sign);
    }

    /**
     * 生成应用签名client_sign
     *
     * @param requestMsg
     * @param clientSecret
     */
    protected void setRequestClientSign(RequestMsg requestMsg, String clientSecret) {
        String clientSign = SignUtil.getSign(requestMsg, clientSecret);
        requestMsg.setClient_sign(clientSign);
    }
}
