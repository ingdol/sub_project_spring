package com.multi.sub_project_spring.Member.dao;

import com.multi.sub_project_spring.Member.model.MemberVO;

public interface MemberDAO {
	String hostName(String hostName);
	String hostPhone(String hostPhone);
	String hostInfo(String hostInfo);
	void hostSign(MemberVO vo);
}
