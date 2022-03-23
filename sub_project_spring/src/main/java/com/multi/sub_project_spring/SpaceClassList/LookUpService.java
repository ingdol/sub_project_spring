package com.multi.sub_project_spring.SpaceClassList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LookUpService implements ILookUpService{
    @Autowired
    @Qualifier("ILookUpDAO")
    ILookUpDAO dao;

    @Override
    public ArrayList<SpaceVO> SpaceList() {
        return dao.SpaceList();
    }

    @Override
    public ArrayList<ClassVO> ClassList() {
        return dao.ClassList();
    }

    @Override
    public ClassVO DetailClass(int classNo) {
        return dao.DetailClass(classNo);
    }

    @Override
    public void UpdateClass(ClassVO classVO) {
        dao.UpdateClass(classVO);
    }
}
