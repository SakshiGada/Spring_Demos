package com.llearning.DI_AnnotationDemo3;

import org.springframework.stereotype.Component;

@Component
public class DemoC extends DemoP
{
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
