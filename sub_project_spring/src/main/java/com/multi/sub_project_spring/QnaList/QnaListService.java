package com.multi.sub_project_spring.QnaList;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class QnaListService implements IQnaListService {
	@Autowired
	@Qualifier("IQnaListDAO")
	IQnaListDAO dao;

	@Override
	public ArrayList<QnaListVO> qnaList() {
		return dao.qnaList();
	}

}
