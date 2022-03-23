package com.multi.sub_project_spring.Login;

import java.util.HashMap;

import com.multi.sub_project_spring.Member.model.MemberVO;

public interface IMemberService {

	MemberVO loginCheck(HashMap<String, Object> map);
}
