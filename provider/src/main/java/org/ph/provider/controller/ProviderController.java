package org.ph.provider.controller;

import org.ph.provider.annotation.ImportService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ph
 * @description 服务提供者
 * @date 2020/8/26
 */
@RestController
@ImportService
public class ProviderController {

    @RequestMapping("/provider/getString")
    public String provider() {

        return "hello world";
    }
}
