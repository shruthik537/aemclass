package javaclass;

import java.util.Scanner;

public class forloop {
	int id;
	String name;												
	public forloop() {        //default constructor
		
	}
	
	public forloop(int id, String name) {       //constructor with 2 parameters
		//super();
		this.id = id;
		this.name = name;
		display();
	}
	void display() {
		System.out.println("id===="+id+"name===="+name);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		for(int i=0; i<1; i++) {
			
			System.out.println("please enter id");
			int stdid=sc.nextInt();

			System.out.println("please enter name");
			String stdname=sc.next();
			forloop obj=new forloop(stdid,stdname);	
			
			//forloop obj1=new forloop(2,"b");
			//forloop obj2=new forloop(3,"c");
		}
		
		
		//forloop obj1=new forloop("2","b");
		//forloop obj2=new forloop("3","c");
		
		
	}

}
