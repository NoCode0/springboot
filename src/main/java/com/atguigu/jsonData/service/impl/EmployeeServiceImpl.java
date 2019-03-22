package com.atguigu.jsonData.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.jsonData.bean.Employee;
import com.atguigu.jsonData.bean.EmployeeExample;
import com.atguigu.jsonData.bean.EmployeeExample.Criteria;
import com.atguigu.jsonData.dao.EmployeeMapper;
import com.atguigu.jsonData.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeMapper mapper;
    
    @Override
    public List<Employee> getAllEmps() {
        return mapper.selectWithDeptByExample(null);
    }

    @Override
    public Boolean isExist(String loginacct, String userpswd) {
        EmployeeExample example = new EmployeeExample();
        Criteria criteria = example.createCriteria();
        criteria.andLoginacctEqualTo(loginacct);
        criteria.andUserpswdEqualTo(userpswd);
        long l = mapper.countByExample(example);
        System.out.println(l);
        if(l != 1){
            return false;
        }
        return true;
    }


}
