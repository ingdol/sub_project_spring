package com.multi.sub_project_spring.SpaceClassList;

import java.util.ArrayList;

public interface ILookUpService {
    ArrayList<SpaceVO> SpaceListAll();
    ArrayList<ClassVO> ClassListAll();
    ArrayList<SpaceVO> SpaceList(String memNick);
    ArrayList<ClassVO> ClassList(String memNick);
    ClassVO DetailClass(int classNo);
    SpaceVO DetailSpace(int spaceNo);
    void UpdateClass(ClassVO classVO);
    void UpdateSpace(SpaceVO spaceVO);
}
