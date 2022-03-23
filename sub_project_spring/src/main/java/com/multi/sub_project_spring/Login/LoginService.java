package com.multi.sub_project_spring.Login;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {
	@Autowired
	@Qualifier("ILoginDAO")
	ILoginDAO dao;
	
	@Override
	public LoginVO loginCheck(HashMap<String, Object> map) {
		return dao.loginCheck(map);
	}
	
	@Override
	public ArrayList<LoginVO> listAllMember() {		
		return dao.listAllMember();
	}



}
