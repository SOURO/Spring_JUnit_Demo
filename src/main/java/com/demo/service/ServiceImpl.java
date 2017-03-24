package com.demo.service;

import com.demo.pojo.Geek;

public class ServiceImpl implements Service {

	public boolean showGeekDetails(Geek geek) {
		System.out.println("Geek Name: " + geek.getName() + ", Fav Prog Lang: "
				+ geek.getFavLanguage() + ", No. of Codes: "
				+ geek.getCodeNumber());
		return true;
	}

}
