package com.test.array;
import java.util.Iterator;

public class arraysconcept {
	int id;
	String name;
	double salary;
	
	public arraysconcept() {
		// TODO Auto-generated constructor stub
	}
	
	public arraysconcept(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		//System.out.println("id"+id+"name"+name+"salary"+salary);
	}
	

	@Override
	public String toString() {
		return "arraysconcept [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	void inArray() {
		int[] x=new int[3];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
			
		}
		strArray();
		
	}
	
	void strArray() {
		String[] x=new String[3];
		x[0]="A";
		x[1]="B";
		x[2]="C";
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
			
		}
		objArray();
		
	}
	void objArray() {
		/*Object[] x=new Object[3];
		x[0]=1;
		x[1]="ABC";
		x[2]=100.10;*/
		
		
		arraysconcept arrconcept1=new arraysconcept(123,"raj",100.10);
		arraysconcept arrconcept2=new arraysconcept(1234,"hello",234.4);
		arraysconcept arrconcept3=new arraysconcept(12345,"world",2345.89);
		
		arraysconcept[] obj=new arraysconcept[3];
		
		
		obj[0]=arrconcept1;
		obj[1]=arrconcept2;
		obj[2]=arrconcept3;
		
				
		for(int i=0;i<obj.length;i++) {
			System.out.println("object array"+obj[i].toString());
			
		}
		
		
	}
	
	public static void main(String[] args) {
		
		arraysconcept obj=new arraysconcept();
		obj.inArray();
		
	}

}
