//package com.chenxin.spingcloudalibaba.feign;/*
// *@Description TODO
// *@Author 名字
// *@Date 2021/7/15 9:49
// */
//
//import org.springframework.stereotype.Component;
//
//@Component
//public class ProviderFeignServiceImpl implements ProviderFeignService {
//    /**
//     * feign 若实现了fallback 那么globalTransaction会失效
//     */
//    @Override
//    public void provider() {
//        System.out.println("报错了");
//        throw new RuntimeException();
//    }
//}
