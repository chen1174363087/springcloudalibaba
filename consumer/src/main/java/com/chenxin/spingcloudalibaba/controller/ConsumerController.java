package com.chenxin.spingcloudalibaba.controller;/*
 *@Description TODO
 *@Author 名字
 *@Date 2021/7/12 15:42
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.chenxin.spingcloudalibaba.service.ConsumerService;

@RestController
@RefreshScope
public class ConsumerController {
    @Value("${config}")
    private String config;

    @Autowired
    private ConsumerService consumerService;

    @GetMapping(value = "/config")
    public String getConfig() {
        return config;
    }

    @GetMapping(value = "/insert")
    public void insert() {
        try {
            consumerService.insert();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping(value = "/insertRollback")
    public void provider() {
        try {
            consumerService.insertRollback();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
