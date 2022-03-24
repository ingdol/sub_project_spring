package com.multi.sub_project_spring.SpaceClassList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@CrossOrigin("*")
@RestController
public class LookUpController {
    @Autowired
    LookUpService lookUpService;

    String memNick = "";

    @RequestMapping("SpaceClassListAll")
    public HashMap<String, Object> LookUpAll(HttpSession session) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("space", lookUpService.SpaceListAll());
        map.put("class", lookUpService.ClassListAll());
        return map;
    }

    @RequestMapping("SessionForList")
    public void sessionNick(@RequestBody HashMap<String, Object> requestData) {
        System.out.println("Load");
        System.out.println(requestData.get("sNick"));
        memNick = (String) requestData.get("sNick");
        System.out.println("memNick : " + memNick);
    }

    @RequestMapping("SpaceClassList")
    public HashMap<String, Object> LookUp(HttpSession session) {
        System.out.println("test");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("space", lookUpService.SpaceList(memNick));
        map.put("class", lookUpService.ClassList(memNick));
        return map;
    }

    @RequestMapping("/DetailClass/{classNo}")
    public ClassVO DetailClass(@PathVariable int classNo) {
        return lookUpService.DetailClass(classNo);
    }


    @RequestMapping("/UpdateClass")
    public void updateProduct(ClassVO classVO) {
        System.out.println(classVO);
        System.out.println(classVO.getClassInfo());
        lookUpService.UpdateClass(classVO);
    }
}
