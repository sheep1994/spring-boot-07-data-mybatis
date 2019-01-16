package com.talent.controller;

import com.talent.mapper.DepartmentMapper;
import com.talent.mapper.EmployeeMapper;
import com.talent.model.Department;
import com.talent.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guobing
 * @Title: DeptController
 * @ProjectName spring-boot-06-jdbc
 * @Description: TODO
 * @date 2019/1/15上午9:55
 */
@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id) {
        System.out.println(departmentMapper.getDeptById(id));
        return departmentMapper.getDeptById(id);
    }

    @GetMapping("/dept")
    public Department insertDept(Department dept) {
        departmentMapper.insert(dept);
        return dept;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id) {
        return employeeMapper.getEmpById(id);
    }

    @GetMapping("/emp")
    public Employee insertEmp(Employee emp) {
        employeeMapper.insertEmp(emp);
        return emp;
    }
}
