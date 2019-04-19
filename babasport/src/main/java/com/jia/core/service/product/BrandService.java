package com.jia.core.service.product;

import java.util.List;

import com.jia.core.bean.product.Brand;

public interface BrandService {
	// 查询所有品牌
	public List<Brand> getBrandList(Brand brand);
}
