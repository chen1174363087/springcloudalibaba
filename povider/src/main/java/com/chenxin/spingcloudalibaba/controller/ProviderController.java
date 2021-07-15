package com.chenxin.spingcloudalibaba.controller;/*
 *@Description TODO
 *@Author 名字
 *@Date 2021/7/12 15:42
 */

import com.chenxin.spingcloudalibaba.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProviderController {
    @Value("${config}")
    private String config;

    @Autowired
    private ProviderService providerService;

    @GetMapping(value = "/config")
    public String getConfig() {
        return config;
    }

    @GetMapping(value = "/insert")
    public void insert() throws Exception {
        providerService.insert();
    }

    @GetMapping(value = "/insertRollback")
    public void insertRollback() throws Exception {
        providerService.insertRollback();
    }


}
