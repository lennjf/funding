package cn.ning.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ning.manager.service.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping("/test.do")
	public String test() {
		System.out.println("laidao le  test.do");
		testService.insert();
		return "success";
	}
}
