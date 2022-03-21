package com.multi.sub_project_spring.QnaList;

import java.util.ArrayList;

public interface IQnaListDAO {

	ArrayList<QnaListVO> qnaList();
	QnaListVO qnadetailview(int hostqnaNo);
	void qnainsert(QnaListVO qna);

}
