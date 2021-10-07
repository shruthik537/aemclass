package javaclass;

import java.util.Scanner;

public class scannerconceptexample {

	int a;          //default value is 0
	int b;          //default value is 0
	
	public void add(int a, int b) {            //Non static method
		//business logic
		int c=a+b;
		System.out.println("c value===="+c);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //object creation of scanner class
		System.out.println("enter a value");
		int x=sc.nextInt();
		System.out.println("enter b value");
		int y=sc.nextInt();
		scannerconceptexample obj=new scannerconceptexample();
		obj.add(x,y);
		
		
		
		
	}
}
