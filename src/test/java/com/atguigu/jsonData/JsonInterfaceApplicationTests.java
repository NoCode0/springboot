package com.atguigu.jsonData;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.atguigu.jsonData.bean.Employee;
import com.atguigu.jsonData.dao.EmployeeMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=JsonInterfaceApplication.class)
public class JsonInterfaceApplicationTests {
    @Autowired
    EmployeeMapper mapper;
	@Test
	public void test(){
	    List<Employee> list = mapper.selectWithDeptByExample(null);
	    System.out.println(list.get(0).getDept().getDeptName());
	}

}
