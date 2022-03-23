package com.multi.sub_project_spring.Login;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
	@Autowired
	MemberService service;
	
	// 로그인 폼으로 이동
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "/member/loginForm";
	}
	
	// 로그인 처리 : id와 pwd 전달 받아서 로그인 체크
	@ResponseBody
	@RequestMapping("/login")
	public String loginCheck(@RequestParam HashMap<String, Object> param,
												HttpSession session) {
		
		// 로그인 체크 결과
		MemberVO vo = service.loginCheck(param);
		String result = "fail";
		
		if(vo != null) {
			// 로그인 성공하면 세션 변수 지정
			session.setAttribute("sid", vo.getMemId());
			result = "success";
		} 
		
		return result;
		
	}
}
