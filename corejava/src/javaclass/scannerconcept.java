package javaclass;
import java.util.Scanner;
public class scannerconcept {
	int a;
	int b;
	int c;
	
	void m1(int a,int b) {

	c=a+b;
	System.out.println("c value:" +c);
	
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a value");
		int y= sc.nextInt();
		System.out.println("enter b value");
		int x= sc.nextInt();
		scannerconcept obj= new scannerconcept();
		obj.m1(y,x);
				
		
		
	}


}

