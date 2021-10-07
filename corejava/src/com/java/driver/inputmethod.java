package com.java.driver;

import java.util.Scanner;

import com.java.bean.bookDetails;


public class inputmethod {
	
	bookDetails info;
	
	
	public inputmethod() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	bookDetails[] registerbook() {
		
		
		bookDetails obj[]= new bookDetails[3];
		bookDetails ob=null;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {

			System.out.println("enter the authorname");
			String authorname=sc.next();
			System.out.println("enter id");
			int bookid=sc.nextInt();
			System.out.println("enter the bookname");
			String bookname=sc.next();
			obj[i]=new bookDetails(authorname, bookid, bookname);
						
		}
		allbooks(obj);
		
		return obj;
	}
	void allbooks(bookDetails[] x) {
		for(int i=0;i<x.length; i++) {
			bookDetails info=x[i];
			 
			info.getBookid();
			 Scanner sc=new Scanner(System.in);
			 System.out.println("get information by bookid");
			 int bid=sc.nextInt();
			 
			 if(info.getBookid()==bid) {
				System.out.println("authorname"+info.getAuthorname()+"bookid"+info.getBookid()+"bookname"+info.getBookname());
				} else {
					 
					 System.out.println("no book id found");
				 }
      	}
	}
		
		public static void main(String[] args) {

			inputmethod obj=new inputmethod();
			obj.registerbook();
			
			
			}
		
	}


