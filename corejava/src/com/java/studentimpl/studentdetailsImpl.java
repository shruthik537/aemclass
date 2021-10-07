package com.java.studentimpl;

import com.java.bean.StudentBean;
import com.java.constants.myconstants;
import com.java.studentintface.studentI;

public class studentdetailsImpl implements studentI{

	@Override
	public StudentBean registerstudentdetails(int id, String name, String address) {
		// TODO Auto-generated method stub
		StudentBean obj= new StudentBean();
		
		
		/*obj.setId(myconstants.id);
		obj.setName(myconstants.name);
		obj.setAddress(myconstants.address);*/
		obj.setId(id);
		obj.setAddress(address);
		obj.setName(name);
		
		System.out.println("studentbean data from-----registerstudentdetails"+obj.toString());
		
		
		return null;
	}

}
 