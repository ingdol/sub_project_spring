package com.multi.sub_project_spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.multi.sub_project_spring.QnaList.IQnaListDAO;

@SpringBootApplication
@ComponentScan(basePackages = {"com.multi.sub_project_spring"})
@MapperScan(basePackageClasses = IQnaListDAO.class)
public class SubProjectSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubProjectSpringApplication.class, args);
	}

}
