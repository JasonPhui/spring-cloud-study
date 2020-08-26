package org.ph.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ph
 * @description 服务提供者同时也可以是服务消费者
 * @date 2020/8/26
 */
@RestController
public class ProviderConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/provider/consumer")
    public String providerConsumer() {
        return restTemplate.getForEntity("http://study-client/getServices", String.class).getBody();
    }
}
