package com.jujcgu.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class MyFirstService {

	private MyFirstClass myFirstClass;
	private Environment environment;

	@Autowired
	public void setMyFirstClass(@Qualifier("myThirdBean") MyFirstClass myFirstClass) {
		this.myFirstClass = myFirstClass;
	}

	public String tellAStrory() {
		return "the dependency is saying: " + myFirstClass.sayHello();
	}
	
	public String getJavaVersion() {
		return "Java version is: " + environment.getProperty("java.version");
	}
	
	public String getOSName() {
		return "Operation System is: " + environment.getProperty("os.name");
	}
	public String readProp() {
		return environment.getProperty("my.custom.property");
	}

	@Autowired
	public void setEnvironment(Environment environment) {
		this.environment = environment;
	}

}
