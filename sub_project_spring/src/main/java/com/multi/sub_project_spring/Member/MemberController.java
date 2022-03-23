package com.multi.sub_project_spring.Member;

import java.util.HashMap;

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
	
	@RequestMapping(value="host-sign")
	public String hostSign(@RequestBody HashMap<String, String> param) {
		System.out.println(param);
		System.out.println(param.get("hostName"));
		
		MemberVO vo = new MemberVO();
		vo.setHostName(param.get("hostName"));
		vo.setHostPhone(param.get("hostPhone"));
		vo.setHostInfo(param.get("hostInfo"));
		
		memberService.hostSign(vo);
		
		return "안녕하세요";
	}

}
