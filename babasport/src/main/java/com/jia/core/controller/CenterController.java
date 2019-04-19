package com.jia.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jia.core.bean.TestTb;

@Controller
@RequestMapping(value="/control")
public class CenterController {
	/*
	 * @RequestMapping(value="/test/springmvc.do") public String
	 * testSpringmvc(TestTb testTb, ModelMap model) { System.out.println(testTb);
	 * return "success"; }
	 */
	
	
	@RequestMapping(value="/index.do")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/top.do")
	public String top() {
		return "top";
	}
	@RequestMapping(value="/left.do")
	public String left() {
		return "left";
	}
	@RequestMapping(value="/right.do")
	public String right() {
		return "right";
	}
	@RequestMapping(value="/main.do")
	public String main() {
		return "main";
	}
	
}
