package com.atguigu.jsonData.service;

import java.util.List;

import com.atguigu.jsonData.bean.Employee;
import com.atguigu.jsonData.bean.EmployeeExample;

public interface EmployeeService {
    
    public List<Employee> getAllEmps();
    
    public Boolean isExist(String loginacct, String userpswd);
}

