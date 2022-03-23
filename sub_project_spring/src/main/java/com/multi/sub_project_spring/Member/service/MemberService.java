package com.multi.sub_project_spring.Member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multi.sub_project_spring.Member.dao.MemberDAO;
import com.multi.sub_project_spring.Member.model.MemberVO;

@Service
public class MemberService implements IMemberService {
	
	@Autowired
	MemberDAO dao;
	
	@Override
	public String memId(String memId) {
		// TODO Auto-generated method stub
		return dao.memId(memId);
	}
	
	@Override
	public String memPw(String memPw) {
		// TODO Auto-generated method stub
		return dao.memPw(memPw);
	}

	@Override
	public String hostName(String hostName) {
		// TODO Auto-generated method stub
		return dao.hostName(hostName);
	}

	@Override
	public String hostPhone(String hostPhone) {
		// TODO Auto-generated method stub
		return dao.hostPhone(hostPhone);
	}

	@Override
	public String hostInfo(String hostInfo) {
		// TODO Auto-generated method stub
		return dao.hostInfo(hostInfo);
	}
	
	@Override
	public void hostSign(MemberVO vo) {
		// TODO Auto-generated method stub
		dao.insertHostSign(vo);
	}
	
	@Override
	public MemberVO SignIn(MemberVO vo) {
		// TODO Auto-generated method stub
		return dao.selectSignIn(vo);
	}

}
