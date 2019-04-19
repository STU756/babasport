package com.jia.core.dao.product;

import java.util.List;

import com.jia.core.bean.product.Brand;

public interface BrandDao {
	//查询所有品牌
	public List<Brand> getBrandList(Brand brand);
}
