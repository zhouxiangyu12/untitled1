package com.example.common.base;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by vmuser042 on 2017/9/22.
 */
public interface BaseDao<T> extends Mapper<T>,MySqlMapper<T> {
}
