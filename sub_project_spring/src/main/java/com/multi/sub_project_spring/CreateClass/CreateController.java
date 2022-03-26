package com.multi.sub_project_spring.CreateClass;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multi.sub_project_spring.Member.model.MemberVO;
import com.multi.sub_project_spring.SpaceClassList.ClassVO;
import com.multi.sub_project_spring.SpaceClassList.SpaceVO;

@CrossOrigin("*")
@RestController
public class CreateController {
	@Autowired
	CreateClassService service;
	@Autowired
	CreateSpaceService service2;
	
	String memNick = "";
	
	@RequestMapping(value="/Class/insert")
	public void insertClass( ClassVO cl) {		
		

		service.insertClass(cl);	 
	}
	
	@RequestMapping(value="/Space/insert")
	public void insertSpace( SpaceVO sp) {		
		

		service2.insertSpace(sp);	 
	}
	
    @RequestMapping("SessionFourList")
    public void sessionNickname(@RequestBody HashMap<String, Object> requestData) {
        
    	memNick = (String) requestData.get("sNick");
    	System.out.println(memNick);
    }

    @RequestMapping("HostCheck")
    public int HostCheck(HttpSession session) {
        
    	ArrayList<HostVO> cmList =  service.HostCheck(memNick);
       int check = cmList.size();
        
        
        return check;
    }
}
