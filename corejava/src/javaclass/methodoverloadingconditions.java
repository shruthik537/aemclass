package javaclass;

import java.util.Scanner;

public class methodoverloadingconditions{

	int ackno;
	String aadhar;
	int pan;
	String name;
	static void getdlstatus(int ackno) {
		if(ackno==100) {
		System.out.println("approved");
		}
		else {
			System.out.println("not approved");
		}
				
	}
    static void getdlstatus(String aadhar, int pan) {
    	if(aadhar=="abc"&&pan==30) {
    		System.out.println("approved");
    		}
    		else {
    			System.out.println("not approved");
    		}
    								
	}
    static void getdlstatus(String name) {
		
    	if(name=="xyz") {
    		System.out.println("approved");
    		}
    		else {
    			System.out.println("not approved");
    		}
    		
				
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
    
    methodoverloadingconditions obj=new methodoverloadingconditions();
    
    obj.getdlstatus(ackno);
    obj.getdlstatus(aadhar,pan);
    obj.getdlstatus(name);
    
    }
    
}
