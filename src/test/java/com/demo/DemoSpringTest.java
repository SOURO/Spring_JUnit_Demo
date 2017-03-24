package com.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.appconfig.AppConfig;
import com.demo.pojo.Geek;
import com.demo.service.Service;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class DemoSpringTest {
	@Autowired
	private Service service;
	@Test
	public void testShowGeekDetails(){
		Geek geek = new Geek();
		geek.setCodeNumber(5);
		geek.setFavLanguage("C/C++/Java/Python");
		geek.setName("Souro");
		boolean res = service.showGeekDetails(geek);
		assertTrue(res);
	}

}
