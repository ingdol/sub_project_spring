package com.multi.sub_project_spring.Login;

import java.util.ArrayList;
import java.util.HashMap;

public interface ILoginDAO {

	LoginVO loginCheck(HashMap<String, Object> map);
	ArrayList<LoginVO> listAllMember();
	LoginVO memInfo(String memId);
}
