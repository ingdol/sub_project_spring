package com.multi.sub_project_spring.Member;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.sub_project_spring.Member.model.MemberVO;
import com.multi.sub_project_spring.Member.service.MemberService;

@RestController
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	
	@RequestMapping(value="/host-sign")
	public void hostSignController(@RequestBody MemberVO memberVO, HttpServletRequest request) {
		memberService.hostSign(memberVO);

	}
	

	@RequestMapping(value = "/login")
	public MemberVO signInController(@RequestBody MemberVO memberVO, HttpServletRequest request) {
		
		MemberVO key = new MemberVO();
		key = memberService.SignIn(memberVO);
		
		if(key == null) {
			key = new MemberVO();
			key.setResult("fail");
		}else {
			key.setResult("success");
			//session.setAttribute("sid", key.getMemId());
			//session.setMaxInactiveInterval(1800); // 30분
		}
		
		return key;
	}

}
