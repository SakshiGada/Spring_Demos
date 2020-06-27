package com.llearning.DI_AnnotationDemo4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoP 
{
	@Autowired
	DemoC demoC;
	public void greet()
	{
		System.out.println("Hello from DemoP "+demoC.name);
	}
}
