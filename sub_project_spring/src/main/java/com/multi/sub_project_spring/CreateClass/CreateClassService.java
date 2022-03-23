package com.multi.sub_project_spring.CreateClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.multi.sub_project_spring.SpaceClassList.ClassVO;

@Service
public class CreateClassService implements ICreateClassService {
	@Autowired
	@Qualifier("ICreateClassDAO")
	ICreateClassDAO dao;
	
	
	@Override
	public void insertClass(ClassVO cl) {
		// TODO Auto-generated method stub
		dao.insertClass(cl);
	}

}
