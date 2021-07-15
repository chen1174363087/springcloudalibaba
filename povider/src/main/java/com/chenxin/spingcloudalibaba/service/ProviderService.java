package com.chenxin.spingcloudalibaba.service;/*
 *@Description TODO
 *@Author 名字
 *@Date 2021/7/15 8:49
 */

import com.chenxin.spingcloudalibaba.dao.ProviderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProviderService {
    @Autowired
    private ProviderDao providerDao;

    public void insert() throws Exception {
        providerDao.insert();
    }

    public void insertRollback() throws Exception {
        providerDao.insert();
        throw new RuntimeException("回滚");
    }
}
