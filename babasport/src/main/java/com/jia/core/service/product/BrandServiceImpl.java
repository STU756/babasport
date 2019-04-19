package com.jia.core.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jia.core.bean.product.Brand;
import com.jia.core.dao.product.BrandDao;

/**
 * 品牌管理
 * @author Administrator
 *
 */
@Service
@Transactional
public class BrandServiceImpl implements BrandService{
	@Autowired
	private BrandDao brandDao;
	@Override
	public List<Brand> getBrandList(Brand brand) {
		return brandDao.getBrandList(brand);
	}

}
