package com.llearning.DI_AnnotationDemo3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DemoP
{
	@Autowired
	DemoC demoC;
//	public DemoC getDemoC() {
//		return demoC;
//	}
//
//	public void setDemoC(DemoC demoC) {
//		this.demoC = demoC;
//	}

	public void greet()
	{
		demoC.setName("Sakshi Gada");
		System.out.println("Hello from DemoP "+demoC.getName());
	}
	
	
}
