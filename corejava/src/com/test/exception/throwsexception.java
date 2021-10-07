package com.test.exception;

public class throwsexception {
	
	void m1() throws ArithmeticException {
		
		
		int a=10/0;  //unchecked exception, JVM will throw at runtime
		
	}
	
	void m2() {
		m1();
		
	}
public static void main(String[] args) {
	throwsexception obj=new throwsexception();
	obj.m2();
	
	
}
}
