package com.test.inheritance;

public class singlechild extends singleinheritance {
	
	void m2() {
		
		String x=super.name;  //accessing variable
		super.m1();  //accessing method
		//super();  //constructor calling
		System.out.println("x value="+x);
		
	}
	
	public static void main(String[] args) {
		
		/*singleinheritance obj=new singlechild();
		System.out.println("name=="+obj.name);
		String x=obj.m1();
		System.out.println("x value"+x);*/
		
		/*singlechild obj=new singlechild();
		String name=obj.name;
		String x=obj.m1();
		System.out.println("name="+obj.name);
		System.out.println("x value="+x);*/
		
	}
}

