package com.multi.sub_project_spring.CreateClass;

import java.util.ArrayList;

import com.multi.sub_project_spring.Member.model.MemberVO;
import com.multi.sub_project_spring.SpaceClassList.ClassVO;

public interface ICreateClassDAO {
	void insertClass(ClassVO cl);
	ArrayList<HostVO> HostCheck(String memNick);
}
