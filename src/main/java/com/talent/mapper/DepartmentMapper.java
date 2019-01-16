package com.talent.mapper;

import com.talent.model.Department;
import org.apache.ibatis.annotations.*;

/**
 * @author guobing
 * @Title: DepartmentMapper
 * @ProjectName spring-boot-06-jdbc
 * @Description: DepartmentMapper接口
 * @date 2019/1/15上午9:42
 * @Mapper: 指定这是一个操作数据库的mapper
 */
// @Mapper，可以使用一个注解来代替@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);

    @Delete("DELETE FROM department WHERE id = #{id}")
    int delById(Integer id);

    /**
     * @Options#useGeneratedKeys 使用自增主键
     * @param dept
     * @return
     */
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("INSERT INTO department(departmentName) VALUES(#{departmentName})")
    int insert(Department dept);

    @Update("UPDATE department SET departmentName = #{departmentName} WHERE id = #{id}")
    int updateById(Department dept);
}
