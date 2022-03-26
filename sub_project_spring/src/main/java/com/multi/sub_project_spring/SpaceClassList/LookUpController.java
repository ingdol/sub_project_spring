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
        memNick = (String) requestData.get("sNick");
    }

    @RequestMapping("SpaceClassList")
    public HashMap<String, Object> LookUp(HttpSession session) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("space", lookUpService.SpaceList(memNick));
        map.put("class", lookUpService.ClassList(memNick));
        return map;
    }

    @RequestMapping("/DetailClass/{classNo}")
    public ClassVO DetailClass(@PathVariable int classNo) {
        return lookUpService.DetailClass(classNo);
    }

    @RequestMapping("/DetailSpace/{spaceNo}")
    public SpaceVO DetailSpace(@PathVariable int spaceNo) {
        return lookUpService.DetailSpace(spaceNo);
    }

    @RequestMapping("/UpdateClass")
    public void updateClass(ClassVO classVO) {
        lookUpService.UpdateClass(classVO);
    }

    @RequestMapping("/UpdateSpace")
    public void updateSpace(SpaceVO spaceVO) {
        lookUpService.UpdateSpace(spaceVO);
    }
}
