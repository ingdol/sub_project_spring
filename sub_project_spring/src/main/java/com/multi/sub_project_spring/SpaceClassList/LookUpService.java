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
    public ArrayList<SpaceVO> SpaceListAll() {
        return dao.SpaceListAll();
    }

    @Override
    public ArrayList<ClassVO> ClassListAll() {
        return dao.ClassListAll();
    }

    @Override
    public ClassVO DetailClass(int classNo) {
        return dao.DetailClass(classNo);
    }

    @Override
    public SpaceVO DetailSpace(int spaceNo) {
        return dao.DetailSpace(spaceNo);
    }

    @Override
    public void UpdateClass(ClassVO classVO) {
        dao.UpdateClass(classVO);
    }

    @Override
    public void UpdateSpace(SpaceVO spaceVO) {
        dao.UpdateSpace(spaceVO);
    }

    @Override
    public ArrayList<SpaceVO> SpaceList(String memNick) {
        return dao.SpaceList(memNick);
    }

    @Override
    public ArrayList<ClassVO> ClassList(String memNick) {
        return dao.ClassList(memNick);
    }
}
