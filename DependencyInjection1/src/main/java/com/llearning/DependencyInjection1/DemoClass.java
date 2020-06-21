package com.llearning.DependencyInjection1;

public class DemoClass 
{
	public ChildDemo childDemo;

	public ChildDemo getChildDemo() {
		return childDemo;
	}

	public void setChildDemo(ChildDemo childDemo) {
		this.childDemo = childDemo;
	}
	
	public void showMessage()
	{
		System.out.println("Hello from "+childDemo.getUsername());
	}
}
