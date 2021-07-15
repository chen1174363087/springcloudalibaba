package com.chenxin.spingcloudalibaba.dao;/*
 *@Description TODO
 *@Author 名字
 *@Date 2021/7/15 8:52
 */

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProviderDao {
    void insert() throws Exception;
}
