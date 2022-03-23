package com.multi.sub_project_spring.Member.dao;

import com.multi.sub_project_spring.Member.model.MemberVO;

public interface MemberDAO {
	String memId(String memId);
	String memPw(String memPw);
	String hostName(String hostName);
	String hostPhone(String hostPhone);
	String hostInfo(String hostInfo);
	void insertHostSign(MemberVO vo);
	MemberVO selectSignIn(MemberVO vo);
}
