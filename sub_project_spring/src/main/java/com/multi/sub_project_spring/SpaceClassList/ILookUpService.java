package com.multi.sub_project_spring.SpaceClassList;

import java.util.ArrayList;

public interface ILookUpService {
    ArrayList<SpaceVO> SpaceList();
    ArrayList<ClassVO> ClassList();
    ClassVO DetailClass(int classNo);
    void UpdateClass(ClassVO classVO);
}
