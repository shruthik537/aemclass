package firstweb.service;

import firstweb.bean.Emp;

public interface EmpRegister {
	
	public void EmpRegi(int id, String name,String email,String password,String country);
	
	public int save(Emp e);
	public int update(Emp e);
	public int delete(Emp e);
	public Emp getEmployeeById(int id);
	

} 
