package com.jia.core.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/product")
public class ProductController {
	@RequestMapping(value="/list.do")
	public String list() {
		return "product/list";
	}
	
}
