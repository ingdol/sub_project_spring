package com.multi.sub_project_spring.CreateClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multi.sub_project_spring.SpaceClassList.SpaceVO;

@Service
public class CreateSpaceService implements ICreateSpaceService {
	@Autowired
	@Qualifier("ICreateSpaceDAO")
	ICreateSpaceDAO dao;
	
	
	@Override
	public void insertSpace(SpaceVO cl) {
		// TODO Auto-generated method stub
		dao.insertSpace(cl);
	}

}
