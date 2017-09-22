package com.example.mapper;

import com.example.common.base.BaseDao;
import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseDao<User> {
}