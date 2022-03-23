package com.multi.sub_project_spring.Login;

import java.util.HashMap;

public interface IMemberDAO {

	MemberVO loginCheck(HashMap<String, Object> map);
}
