package com.chenhao.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class TestC {

	@Autowired
	private String a;
	private int c;
	private String b;
	@Autowired
	private TestA testA;
	@Autowired
	private TestB testB;

	private MyTestBean myTestBean;

	public TestB getTestB() {
		return testB;
	}

	public void setTestB(TestB testB) {
		this.testB = testB;
	}
	public void sys(){
		System.out.println(12);
		System.out.println(myTestBean.getName());
	}

	public MyTestBean getMyTestBean() {
		return myTestBean;
	}

	public void setMyTestBean(MyTestBean myTestBean) {
		this.myTestBean = myTestBean;
	}
}
