package com.example.demo.service;

import com.example.demo.domain.User;

/**
 * @Author: guokk
 * @Date: 2019/7/2 0002
 * @Version 1.0
 */
public interface IUserService {

    User findByUserName(String username);
}
