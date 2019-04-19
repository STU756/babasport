package com.jia.core.controller.product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/order")
public class OrderController {
	@RequestMapping(value="/list")
	public String list() {
		return "order/list";
	}
}
