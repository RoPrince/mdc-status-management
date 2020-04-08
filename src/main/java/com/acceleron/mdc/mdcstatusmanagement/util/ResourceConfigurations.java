package com.acceleron.mdc.mdcstatusmanagement.util;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Data
@Component
public class ResourceConfigurations {

    @Value("${datacenter.url}")
    private String dataCenterUrl;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        // Do any additional configuration here
        return builder.build();
    }


}
