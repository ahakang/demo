package com.example.demo.dao;

import com.example.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: guokk
 * @Date: 2019/7/2 0002
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    User findByUserName(@Param("username") String username);
}
