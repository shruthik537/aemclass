package javaclass;

import java.util.Scanner;

public class methodoverloading{

	int ackno;
	String aadhar;
	int pan;
	String name;
	static void getdlstatus(int ackno) {
		
		System.out.println("approved");
				
	}
    static void getdlstatus(String aadhar, int pan) {
		
		System.out.println("approved");
				
	}
    static void getdlstatus(String name) {
		
		System.out.println("approved");
				
	}
    public static void main(String[] args) {
	  
    Scanner sc=new Scanner(System.in);
    System.out.println("enter ackno number");
    int ackno=sc.nextInt();
    //getdlstatus(ack);
     System.out.println("enter aadhar");
    String aadhar=sc.next();
    System.out.println("enter pan");
    int pan=sc.nextInt();
    //getdlstatus(aadhar, pan);
    System.out.println("enter name");
    String name=sc.next();
    //getdlstatus(name);
    
    methodoverloading obj=new methodoverloading();
    
    obj.getdlstatus(ackno);
    obj.getdlstatus(aadhar,pan);
    obj.getdlstatus(name);
    
    }
    
}
