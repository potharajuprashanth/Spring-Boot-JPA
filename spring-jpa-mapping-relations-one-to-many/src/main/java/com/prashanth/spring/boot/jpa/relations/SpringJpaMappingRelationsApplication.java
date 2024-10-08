package com.prashanth.spring.boot.jpa.relations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJpaMappingRelationsApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext container=		SpringApplication.run(SpringJpaMappingRelationsApplication.class, args);
		DbService ds=container.getBean(DbService.class);
	//ds.addEmployee();
	//	ds.deleteEmployeeInfo();
	ds.getEmployeeInfoById();
	}

}
