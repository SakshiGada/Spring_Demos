package com.llearning.DI_AnnotationDemo3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.llearning.DI_AnnotationDemo3")
public class DemoConfig
{
//	@Bean
//	public DemoC getDemoCObj()
//	{
//		return new DemoC();
//	}
}
