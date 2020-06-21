package com.llearning.DI_AnnotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.llearning.DI_AnnotationDemo")
public class DemoConfig 
{
	@Bean
	public DemoClass getDemoClassObj()
	{
		DemoClass demoClass = new DemoClass();
		return demoClass;
	}
}
