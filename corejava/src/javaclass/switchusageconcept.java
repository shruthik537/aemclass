package javaclass;

import java.util.Scanner;

public class switchusageconcept {
	
	String stdid="1";
	String stdname="abc";
	String empid="2";
	String empname="xyz";
			
	
	void studentdetails() {
		System.out.println("stdid ----" +stdid);
		System.out.println("stdname ----" +stdname);
	}
	void employeedetails() {
	
		System.out.println("empid ----" +empid);
		System.out.println("empname ----" +empname);
	}
public static void main(String[] args) {
	
	switchusageconcept obj=new switchusageconcept();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int number=sc.nextInt();
	switch(number) {
	case 1:
		obj.studentdetails();
		break;
	case 2:
		obj.employeedetails();
		break;
	default:
		System.out.println("default method");
		break;
	}
	
}
}

