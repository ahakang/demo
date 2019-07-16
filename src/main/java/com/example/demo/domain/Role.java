package com.example.demo.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

/**
 * @Author: guokk
 * @Date: 2019/7/2 0002
 * @Version 1.0
 */
@TableName("cc_role")
public class Role {

    @TableId
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
