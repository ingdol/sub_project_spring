package com.multi.sub_project_spring.Login;

import java.util.HashMap;

public interface ILoginDAO {

	LoginVO loginCheck(HashMap<String, Object> map);
}
