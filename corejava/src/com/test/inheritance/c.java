package com.test.inheritance;


public class c extends b {
	
		
	void m3() {
		String a=super.str;
		String b= super.str1;
		
		System.out.println("a value="+a);
		System.out.println("b value="+b);
		super.m1();
		super.m2();
		
		
		
		
	}
	public static void main(String[] args) {
		
		c obj=new c();
		
		
		obj.m3();
		
		
	}

}
