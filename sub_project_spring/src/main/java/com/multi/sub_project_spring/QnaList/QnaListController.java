package com.multi.sub_project_spring.QnaList;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class QnaListController {

	@Autowired
	QnaListService qnaser;
	
	// 전제 qna게시판 조회
	@RequestMapping("qnalist")
	public HashMap<String, Object> qnalist() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("qnaList",qnaser.qnaList());		
		return map; // qna 리스트
	}
	
//	@RequestMapping("qnalist")
//	public ArrayList<QnaListVO> qnalist() {
//		ArrayList<QnaListVO> qnaList = qnaser.qnaList();		
//		return qnaList; // qna 리스트
//	}
}
