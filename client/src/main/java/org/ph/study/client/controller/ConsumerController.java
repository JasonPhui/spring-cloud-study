package org.ph.study.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ph
 * @description 消费者控制器
 * @date 2020/8/23
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ribbon-consumer")
    public String consumer() {
        return restTemplate.getForEntity("http://cloud-register/app", String.class).getBody();
    }
}
