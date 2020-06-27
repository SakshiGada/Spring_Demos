package com.llearning.DI_AnnotationDemo3;

import org.springframework.stereotype.Component;

@Component
public class DemoClass
{
	public void show()
	{
		System.out.println("Hello from DemoClass");
	}
}
