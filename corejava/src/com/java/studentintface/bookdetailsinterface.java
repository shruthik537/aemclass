package com.java.studentintface;

import com.java.bean.bookDetails;

public interface bookdetailsinterface {
	
	bookDetails bookinfo(String authorname, int id, String bookname, String yearofpublish, String selfnum);
	//default abstract method

}
