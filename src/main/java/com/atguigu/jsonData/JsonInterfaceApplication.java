package com.atguigu.jsonData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement//事务
@ServletComponentScan//web组件 servlet、listener、filter
public class JsonInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(JsonInterfaceApplication.class, args);
	}

}
