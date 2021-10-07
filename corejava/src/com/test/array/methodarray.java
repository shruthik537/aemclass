package com.test.array;

public class methodarray {
	int id;
	String name;
	double salary;
	static methodarray s;
	
	public methodarray() {
		// TODO Auto-generated constructor stub
	}
	public methodarray(methodarray[]  obj) {
		for(int i=0;i<3;i++) {
			methodarray s=obj[i];
			System.out.println(s);
		}
			
	}
	
	
	
	public methodarray(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		//System.out.println("id"+id+"name"+name+"salary"+salary);
	}
	
	@Override
	public String toString() {
		return "methodarray [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public static void main(String[] args) {
		methodarray[] obj=new methodarray[3];
		obj[0]=new methodarray(1,"a",10.1);
		obj[1]=new methodarray(2,"b",20.1);
		obj[2]=new methodarray(3,"c",30.1);
		new methodarray(obj);
		
		
	}

}
