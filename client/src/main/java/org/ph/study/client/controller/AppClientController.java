package org.ph.study.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
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

    @RequestMapping("/getInstances/{serviceId}")
    public List<ServiceInstance> getServiceInstances(@PathVariable("serviceId") String serviceId) {
        List<ServiceInstance> instances = discoveryClient.getInstances(serviceId);
        if (instances != null) {
            for (ServiceInstance instance: instances) {
                logger.info("******************************");
                logger.info("服务实例信息：");
                logger.info("服务 ServiceId：" + instance.getServiceId());
                logger.info("服务Host：" + instance.getHost());
                logger.info("服务Port：" + instance.getPort());
                logger.info("服务Uri：" + instance.getUri());
                logger.info("服务Metadata：" + instance.getMetadata());
                logger.info("******************************");
            }
        }
        return instances;
    }

    @RequestMapping("/getServices")
    public List<String> getServices() {
        List<String> services = discoveryClient.getServices();
        if (services != null) {
            for (String service: services) {
                logger.info("服务id：" + service);
            }
        } else {
            logger.info("注册中心无服务实例！");
        }

        return services;
    }
}
