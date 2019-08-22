package com.abner.springbootdemo3.service;

import com.abner.springbootdemo3.pojo.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> findAllEmp();
}
