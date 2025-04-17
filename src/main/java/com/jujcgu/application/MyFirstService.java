package com.jujcgu.application;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class MyFirstService {

	private final MyFirstClass myFirstClass;

	@Value("${my.custom.property}")
	private String customProperty;

	@Value("${my.prop}")
	private String customPropertyFromAnotherFile;

	@Value("${my.custom.property.integer}")
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
