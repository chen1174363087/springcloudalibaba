package com.chenxin.spingcloudalibaba.service;/*
 *@Description TODO
 *@Author 名字
 *@Date 2021/7/15 8:49
 */

import com.chenxin.spingcloudalibaba.dao.ConsumerDao;
import com.chenxin.spingcloudalibaba.feign.ProviderFeignService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @Autowired
    private ConsumerDao consumerDao;

    @Autowired
    private ProviderFeignService providerFeignService;

    @GlobalTransactional(name = "consumer-provider", rollbackFor = Exception.class)
    public void insert() throws Exception {
        consumerDao.insert();
        providerFeignService.insert();
    }

    @GlobalTransactional(name = "consumer-provider", rollbackFor = Exception.class)
    public void insertRollback() throws Exception {
        consumerDao.insert();
        providerFeignService.insertRollback();
    }
}
