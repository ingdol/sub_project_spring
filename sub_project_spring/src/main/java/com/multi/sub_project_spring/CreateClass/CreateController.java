package com.multi.sub_project_spring.CreateClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.sub_project_spring.SpaceClassList.ClassVO;
import com.multi.sub_project_spring.SpaceClassList.SpaceVO;

@CrossOrigin("*")
@RestController
public class CreateController {
	@Autowired
	CreateClassService service;
	@Autowired
	CreateSpaceService service2;
	
	@RequestMapping(value="/Class/insert")
	public void insertClass( ClassVO cl) {		
		

		service.insertClass(cl);	 
	}
	
	@RequestMapping(value="/Space/insert")
	public void insertSpace( SpaceVO sp) {		
		

		service2.insertSpace(sp);	 
	}
}
