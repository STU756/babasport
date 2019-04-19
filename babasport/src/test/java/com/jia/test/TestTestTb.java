package com.jia.test;


import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jia.common.junit.SpringJunitTest;
import com.jia.core.bean.TestTb;
import com.jia.core.service.TestTbService;

public class TestTestTb extends SpringJunitTest{
	@Autowired
	private TestTbService testTbService;
	
	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testDataSource() throws SQLException {
		System.out.println(dataSource.getConnection());
	}
	
	@Test
	public void testAdd() {
		TestTb testTb = new TestTb();
		testTb.setName("zhouxianrui222");
		testTb.setBirthday(new Date());
		testTbService.add(testTb);
	}
}
