package com.llearning.DependencyInjection2;

public class DemoClass implements DemoParent{

	int val;
	
	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public void showMessage() 
	{
		System.out.println("The value is "+val);
	}

}
