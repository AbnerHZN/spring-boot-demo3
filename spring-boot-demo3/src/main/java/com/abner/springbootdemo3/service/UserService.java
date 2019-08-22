package com.abner.springbootdemo3.service;

import com.abner.springbootdemo3.pojo.Student;

import java.util.List;

public interface UserService {
    List<Student> findStudents();
}
