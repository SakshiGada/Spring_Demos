package com.llearning.DI_AnnotationDemo2;

import org.springframework.stereotype.Component;

@Component
public class DemoClass
{
	public void show()
	{
		System.out.println("Hello From DemoClass");
	}
}
