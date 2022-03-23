package com.multi.sub_project_spring.SpaceClassList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@CrossOrigin("*")
@RestController
public class LookUpController {
    @Autowired
    LookUpService service;

    @RequestMapping("SpaceClassList")
    public HashMap<String, Object> LookUp() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("space", service.SpaceList());
        map.put("class", service.ClassList());
        return map;
    }
}
