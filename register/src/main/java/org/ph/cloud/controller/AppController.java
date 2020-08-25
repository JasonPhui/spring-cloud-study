package org.ph.cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ph
 * @Date 2020/8/7
 * @Description 测试controller
 * @Version V1.0
 */
@RestController
public class AppController {

    @RequestMapping("/app")
    public String home() {
        return "hello world";
    }
}
