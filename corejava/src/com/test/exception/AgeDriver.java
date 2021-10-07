package com.test.exception;

public class AgeDriver {
	static int Age=10;
	
	public static void main(String[] args) {
		
		if(Age<18) {
			try {
				throw new invalidageexception("You are not eligible to vote");
				}
			catch(Exception e) {
				//To handle exception
				//e.printStackTrace();
				e.getMessage();
				System.out.println(e.getMessage());
		
								}
					}
			else {
				System.out.println("welcome to vote");
			    }
	}

}
