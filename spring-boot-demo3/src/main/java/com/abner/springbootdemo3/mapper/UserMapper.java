package com.abner.springbootdemo3.mapper;

import com.abner.springbootdemo3.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM student")
    List<Student> getStudents();
}
