package com.git.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.git.domain.BaseResponse;
import com.git.service.DemoService;

@Controller
@ResponseBody
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping("get")
	public BaseResponse get(){
		return BaseResponse.SUCCESSFUL();
	}
	
	@RequestMapping("insert")
	public BaseResponse insert(){
		return BaseResponse.SUCCESSFUL();
	}
	
}
