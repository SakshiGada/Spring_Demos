package com.llearning.DI_AnnotationDemo4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DemoC extends DemoP 
{
	@Value("Sakshi Gada")
	public String name;
}
