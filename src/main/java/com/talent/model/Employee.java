package com.talent.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @author guobing
 * @Title: Employee
 * @ProjectName spring-boot-06-jdbc
 * @Description: 员工实体类
 * @date 2019/1/14下午6:05
 */
public class Employee implements Serializable {

    private Integer id;

    private String lastName;

    private String email;

    private Integer gender;

    private Integer dId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
