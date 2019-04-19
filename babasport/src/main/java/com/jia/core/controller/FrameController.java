package com.jia.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/control")
public class FrameController {
	
	//跳转到商品主体
	@RequestMapping(value="/product_main.do")
	public String productMain() {
		return "frame/product_main";
	}
	@RequestMapping(value="/product_left.do")
	public String left() {
		return "frame/product_left";
	}
	//跳转到订单主体
	@RequestMapping(value="/order_main.do")
	public String orderMain() {
		return "frame/order_main";
	}
	@RequestMapping(value="/order_left.do")
	public String orderLeft() {
		return "frame/order_left";
	}
}
