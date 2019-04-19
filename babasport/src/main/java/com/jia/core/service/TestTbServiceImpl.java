package com.jia.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jia.core.bean.TestTb;
import com.jia.core.dao.TestTbDao;

@Service
@Transactional
public class TestTbServiceImpl implements TestTbService {
	@Autowired
	private TestTbDao testTbDao;
	@Override
	public void add(TestTb testTb) {
		testTbDao.addTestTb(testTb);
//		throw new RuntimeException();
	}

}
