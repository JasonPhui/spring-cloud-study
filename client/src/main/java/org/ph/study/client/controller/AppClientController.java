package org.ph.study.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author ph
 * @description spring cloud 客户端测试
 * @date 2020/8/19
 */
@RestController
public class AppClientController {
    private static final Logger logger = Logger.getLogger(AppClientController.class.getName());

    @Autowired
    private DiscoveryClient discoveryClient;

    public String index() {

        return "client";
    }
}
