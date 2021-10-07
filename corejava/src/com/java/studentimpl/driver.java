package com.java.studentimpl;

import java.util.Scanner;

import com.java.studentintface.studentI;

public class driver {

	public static void main(String[] args) {
		studentI stddetails= new studentdetailsImpl();
		
		
		Scanner sc= new Scanner(System.in);
				System.out.println("please enter student id");
		int id=sc.nextInt();
		System.out.println("please enter student name");
		String name=sc.next();
		System.out.println("please enter student address");
		String address=sc.next();
		
		
		stddetails.registerstudentdetails(id,name,address);
		
		}
		
		
	}
 

