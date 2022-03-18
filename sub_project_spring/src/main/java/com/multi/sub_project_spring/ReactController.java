package com.multi.sub_project_spring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactController {
	@RequestMapping("hello")
	public String hello() {
		return "안녕하세요";
	}
	
	// sej 커밋 테스트
	
	@RequestMapping("sun")
	public String sun() {
		return "서연커밋";
	}
}
