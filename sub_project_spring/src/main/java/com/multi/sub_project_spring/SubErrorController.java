package com.multi.sub_project_spring;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubErrorController implements ErrorController {

	@RequestMapping("/error")
	public String index(HttpServletRequest request) {

		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		Integer satusCode = Integer.valueOf(status.toString());
		if (satusCode == HttpStatus.NOT_FOUND.value()) 
			return "react/index";					

		return "react/index";
	}

}
