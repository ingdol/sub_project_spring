package com.multi.sub_project_spring.SpaceClassList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface ILookUpDAO {
    ArrayList<SpaceVO> SpaceList();
    ArrayList<ClassVO> ClassList();
    ClassVO DetailClass(int classNo);
    void UpdateClass(ClassVO classVO);
}
