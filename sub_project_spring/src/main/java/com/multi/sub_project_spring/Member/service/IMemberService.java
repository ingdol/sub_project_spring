package com.multi.sub_project_spring.Member.service;

import com.multi.sub_project_spring.Member.model.MemberVO;

public interface IMemberService {
	String memId(String memId);
	String memPw(String memPw);
	String hostName(String hostName);
	String hostPhone(String hostPhone);
	String hostInfo(String hostInfo);
	void hostSign(MemberVO vo);
	MemberVO SignIn(MemberVO vo);
}
