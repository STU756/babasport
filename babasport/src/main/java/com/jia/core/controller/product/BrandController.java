package com.jia.core.controller.product;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jia.core.bean.product.Brand;
import com.jia.core.service.product.BrandService;

@Controller
@RequestMapping(value="/brand")
public class BrandController {
	@Autowired
	private BrandService brandService;
	
	@RequestMapping(value="/list.do")
	public String list(HttpServletRequest request, ModelMap model) {
		//创建一个传递参数对象
		Brand brand = new Brand();
		//设置显示或不显示查询条件  1：显示， 0：显示
		brand.setIsDisplay(1);
		//service层处理并返回结果
		List<Brand> brands = brandService.getBrandList(brand);
		model.addAttribute("brands", brands);
		return "brand/list";
	}
	
	
	//跳转添加页面
	@RequestMapping(value="/toAdd.do")
	public String toAdd() {
		return "brand/add";
	}
	
}
