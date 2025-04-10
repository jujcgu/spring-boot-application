package com.jujcgu.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

	@Autowired
	@Qualifier("mySecondBean")
	private MyFirstClass myFirstClass;

	public String tellAStrory() {
		return "the dependency is saying: " + myFirstClass.sayHello();
	}

}
