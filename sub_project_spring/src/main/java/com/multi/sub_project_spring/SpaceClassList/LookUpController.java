package com.multi.sub_project_spring.SpaceClassList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@CrossOrigin("*")
@RestController
public class LookUpController {
    @Autowired
    LookUpService service;



    @RequestMapping("/DetailClass/{classNo}")
    public ClassVO DetailClass(@PathVariable int classNo) {
        return service.DetailClass(classNo);
    }


    @RequestMapping("/UpdateClass")
    public void updateProduct(ClassVO classVO) {
        System.out.println(classVO);
        System.out.println(classVO.getClassInfo());
        service.UpdateClass(classVO);
    }
}
