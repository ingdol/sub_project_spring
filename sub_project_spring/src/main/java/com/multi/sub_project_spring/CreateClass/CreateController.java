package com.multi.sub_project_spring.CreateClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.sub_project_spring.SpaceClassList.ClassVO;

@CrossOrigin("*")
@RestController
public class CreateController {
	@Autowired
	CreateClassService service;
	
	@RequestMapping(value="/Class/insert")
	public void insertClass(ClassVO prd) {		
		service.insertClass(prd);	 
	}
}
