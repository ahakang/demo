package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        // 所有请求都可以不登陆访问
        http.authorizeRequests().anyRequest().permitAll();

        // 登陆页面放开，其他需要登陆验证才能访问
//        http.formLogin().permitAll()          // 定义当需要用户登录时候，转到的登录页面。
//                .and()
//                .authorizeRequests()    // 定义哪些URL需要被保护、哪些不需要被保护
//                .anyRequest()        // 任何请求,登录后可以访问
//                .authenticated();
    }

}