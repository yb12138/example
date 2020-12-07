package com.heeexy.example.util.http;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.ResponseParam;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class QueClient {

    private final WebClient webClient = WebClient.builder()
            .baseUrl("https://erp.datacaciques.com/api/v1/query?api_key=d0f7bbb336fdb74155231ac5b96e49875b0a6ea54f730c3694f3cc5b378d8dba4aee652bb4f04d2abf2ee17e885445f9")
            .defaultHeader("Content-Type", "application/json")
            .build();

    public ResponseParam post(JSONObject object) {
        Mono<ResponseParam> response = webClient.post()
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(object))
                .retrieve()
                .bodyToMono(ResponseParam.class).timeout(Duration.of(10, ChronoUnit.SECONDS));
        return response.block();
    }
}
