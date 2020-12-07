package com.heeexy.example.util.http;

import com.alibaba.fastjson.JSONObject;
import com.heeexy.example.model.ResponseParam;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BirdClient {


    private WebClient webClient = WebClient.builder()
            .baseUrl("https://www.birdsystem.co.uk/client")
            .defaultHeader("Content-Type", "application/json")
            .defaultHeader("company_id", "36")
            .defaultHeader("api_key", "eaeed7ba38d27f628edf827d1cb9fca4")
            .build();

    public ResponseParam post(JSONObject object) {
        Mono<ResponseParam> response = webClient.method(HttpMethod.GET).uri("/consignment?limit=-1")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(object))
                .retrieve()
                .bodyToMono(ResponseParam.class).timeout(Duration.of(10000, ChronoUnit.SECONDS));
        return response.block();
    }

    public ResponseParam post2(JSONObject object) {
        WebClient webClient = WebClient.builder()
                .baseUrl("https://www.birdsystem.co.uk/client")
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("company_id", "36")
                .defaultHeader("api_key", "eaeed7ba38d27f628edf827d1cb9fca4")
                .build();
        Mono<ResponseParam> response = webClient.method(HttpMethod.GET).uri("/consignment-product")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .body(BodyInserters.fromObject(object))
                .retrieve()
                .bodyToMono(ResponseParam.class).timeout(Duration.of(10, ChronoUnit.SECONDS));
        return response.block();
    }
}
