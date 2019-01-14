package com.talent.model;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

/**
 * @author guobing
 * @Title: Department
 * @ProjectName spring-boot-06-jdbc
 * @Description: 部门实体类
 * @date 2019/1/14下午6:09
 */
public class Department implements Serializable {

    private Integer id;

    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
