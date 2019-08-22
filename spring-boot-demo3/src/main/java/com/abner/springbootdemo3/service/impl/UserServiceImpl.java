package com.abner.springbootdemo3.service.impl;

import com.abner.springbootdemo3.mapper.UserMapper;
import com.abner.springbootdemo3.pojo.Student;
import com.abner.springbootdemo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<Student> findStudents() {
        List<Student> students = userMapper.getStudents();
        return students;
    }
}
