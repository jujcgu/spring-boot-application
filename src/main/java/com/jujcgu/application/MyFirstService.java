package com.jujcgu.application;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {

	private final MyFirstClass myFirstClass;

	@Value("Hellow Juan Castro")
	private String customProperty;

	@Value("${my.prop}")
	private String customPropertyFromAnotherFile;

	@Value("123")
	private Integer customPropertyInteger;

	public MyFirstService(@Qualifier("bean1") MyFirstClass myFirstClass) {
		this.myFirstClass = myFirstClass;
	}

	public String tellAStrory() {
		return "the dependency is saying: " + myFirstClass.sayHello();
	}

	public String getCustomPropertyFromAnotherFile() {
		return customPropertyFromAnotherFile;
	}

	public String getCustomProperty() {
		return customProperty;
	}

	public Integer getCustomPropertyInteger() {
		return customPropertyInteger;
	}

}
