package com.chenxin.spingcloudalibaba.feign;/*
 *@Description TODO
 *@Author 名字
 *@Date 2021/7/15 9:47
 */

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(value = "provider", fallback = ProviderFeignServiceImpl.class)
@FeignClient(value = "provider")
public interface ProviderFeignService {
    @GetMapping(value = "/insert")
    void insert();

    @GetMapping(value = "/insertRollback")
    void insertRollback();
}
