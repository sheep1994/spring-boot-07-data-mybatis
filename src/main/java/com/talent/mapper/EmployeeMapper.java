package com.talent.mapper;

import com.talent.model.Employee;

/**
 * @author guobing
 * @Title: EmployeeMapper
 * @ProjectName spring-boot-06-jdbc
 * @Description: 员工Mapper接口
 * @date 2019/1/15上午10:45
 */
// 不管是注解版还是xml配置版，都需要@Mapper注解标识，或者使用@MapperScan注解批量扫描
public interface EmployeeMapper {

    Employee getEmpById(Integer id);

    void insertEmp(Employee emp);
}
