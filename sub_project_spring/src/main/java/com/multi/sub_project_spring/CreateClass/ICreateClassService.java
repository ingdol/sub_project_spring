package com.multi.sub_project_spring.CreateClass;

import java.util.ArrayList;

import com.multi.sub_project_spring.SpaceClassList.ClassVO;

public interface ICreateClassService {
	void insertClass(ClassVO cl);
	ArrayList<HostVO> HostCheck(String memNick);
}
