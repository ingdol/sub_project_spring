package com.multi.sub_project_spring.Login;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import com.multi.sub_project_spring.SpaceClassList.LookUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
public class LoginController {
	@Autowired
	LoginService service;

	@Autowired
	LookUpService lookUpService;

	String tempID = "";
	
	// 로그인 폼으로 이동
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "/loginForm";
	}

	// 로그인 처리 : id와 pwd 전달 받아서 로그인 체크
	@ResponseBody
	@RequestMapping("/login")
	public String loginCheck(@RequestParam HashMap<String, Object> param,
							 HttpSession session) {

		// 로그인 체크 결과
		LoginVO vo = service.loginCheck(param);
		String result = "fail";


		System.out.println(vo.getMemNick());

		if(vo != null) {
			// 로그인 성공하면 세션 변수 지정
			session.setAttribute("sid", vo.getMemId());
			tempID = (String) session.getAttribute("sid");
			result = "success";
		}

		return result;

	}

	@RequestMapping("SpaceClassListAll")
	public HashMap<String, Object> LookUpAll(HttpSession session) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.println("session : " + tempID);
		map.put("space", lookUpService.SpaceListAll());
		map.put("class", lookUpService.ClassListAll());
		return map;
	}

	@RequestMapping("SpaceClassList")
	public HashMap<String, Object> LookUp(HttpSession session) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		System.out.println("session : " + tempID);
		String memNick = service.memInfo(tempID).getMemNick();
		map.put("space", lookUpService.SpaceList(memNick));
		map.put("class", lookUpService.ClassList(memNick));
		return map;
	}
	
	
	@RequestMapping("/viewMemberList")
	public HashMap<String, Object> viewMemberList() {	
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("memList",  service.listAllMember());	
		return map; //상품 리스트 
	}
}
