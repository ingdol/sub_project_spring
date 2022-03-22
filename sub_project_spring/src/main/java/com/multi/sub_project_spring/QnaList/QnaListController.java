package com.multi.sub_project_spring.QnaList;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping("qnadetailview/{hostqnaNo}")
	public QnaListVO qnadetailView(@PathVariable  int hostqnaNo) {		
		System.out.println(qnaser.qnadetailview(hostqnaNo));
		return qnaser.qnadetailview(hostqnaNo);//상품 상세 정보 
	} 
	
	@RequestMapping("qnaInsert")
	public void qnainsert(QnaListVO qna) {		
		qnaser.qnainsert(qna);	 
	}
	
	//삭제
	@RequestMapping("qnadelete/{hostqnaNo}")
	public void qnadelete(@PathVariable int hostqnaNo) {		
		qnaser.qnadelete(hostqnaNo);	 
	}
	
	//게시글수정
	@RequestMapping("qnaupdate")
	public void qnaupdate(QnaListVO qna) {
		qnaser.qnaupdate(qna);
	}
}
