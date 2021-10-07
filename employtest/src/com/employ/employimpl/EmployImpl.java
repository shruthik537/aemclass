package com.employ.employimpl;

import java.util.ArrayList;
import java.util.Scanner;

import com.employ.bean.EmployBean;
import com.employ.employi.employI;

public class EmployImpl implements employI {
	
	static int empid;
	static String empname;
	static double empsal;
	
	public ArrayList<EmployBean> getEmployDetails() {
	
		// TODO Auto-generated method stub
		
			
		EmployBean x=new EmployBean();
		x.setEmpId(1);
		x.setEmpname("hello");
		x.setSalary(5900);
		
		EmployBean x1=new EmployBean();
		x1.setEmpId(2);
		x1.setEmpname("abc");
		x1.setSalary(3000);
		
		EmployBean x2=new EmployBean();
		x2.setEmpId(3);
		x2.setEmpname("DEF");
		x2.setSalary(5000);
		ArrayList list=new ArrayList();
		list.add(x);
		list.add(x1);
		list.add(x2);
		
		
		try {
			
			
			
			if(((EmployBean) list.get(0)).getEmpId()==empid) {
				
				System.out.println("emp id already exists enter different id");
				
			}else if(((EmployBean) list.get(1)).getEmpId()==empid) {
				System.out.println("emp id already exists enter different id");
			}
			else if(((EmployBean) list.get(2)).getEmpId()==empid) {
				System.out.println("emp id already exists enter different id");
			}else {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter emp name");
				empname=sc.next();
					
				System.out.println("enter emp salary");
				empsal=sc.nextDouble();
				
				EmployBean x3=new EmployBean();
				x3.setEmpId(empid);
				x3.setEmpname(empname);
				x3.setSalary(empsal);
				list.add(x3);
				System.out.println("id=="+x3.getEmpId()+"name=="+x3.getEmpname()+"salary=="+x3.getSalary());
				
			}
			
			//comparing given empname with arraylist empname.			
			/*if(((EmployBean) list.get(0)).getEmpname().equals(empname))
			 {
				System.out.println("id=="+x.getEmpId()+"name=="+x.getEmpname()+"salary=="+x.getSalary());
			}else if(((EmployBean) list.get(1)).getEmpname().equals(empname))
			 {
				System.out.println("id=="+x1.getEmpId()+"name=="+x1.getEmpname()+"salary=="+x1.getSalary());
			}else if(((EmployBean) list.get(2)).getEmpname().equals(empname))
			 {
				System.out.println("id=="+x2.getEmpId()+"name=="+x2.getEmpname()+"salary=="+x2.getSalary());
			}
			else {
				
				throw new Exception();
			}*/
//comparing given emp id with arraylist emp id.
			/*if(((EmployBean) list.get(0)).getEmpId()==empid)
			 {
				System.out.println("id=="+x.getEmpId()+"name=="+x.getEmpname()+"salary=="+x.getSalary());
			}else if(((EmployBean) list.get(1)).getEmpId()==empid)
			 {
				System.out.println("id=="+x1.getEmpId()+"name=="+x1.getEmpname()+"salary=="+x1.getSalary());
			}else if(((EmployBean) list.get(2)).getEmpId()==empid)
			 {
				System.out.println("id=="+x2.getEmpId()+"name=="+x2.getEmpname()+"salary=="+x2.getSalary());
			}
			else {
				
				throw new Exception();
			}	*/
			
			}
		 catch (Exception e) {
			// TODO: handle exception
			 System.out.println("user does not exist");
		}
		
		finally {
			
		}
		
		
		System.out.println("arraylist impl data------"+list);
		
		
		return list;
		
	}


public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
			
		System.out.println("enter emp id");
		empid=sc.nextInt();
			
		employI emp=new EmployImpl();
		
		emp.getEmployDetails();
	
	
}
}

