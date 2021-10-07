package com.employ.bean;

public class EmployBean {

	
	private int empId;
	private String empname;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployBean [empId=" + empId + ", empname=" + empname + ", salary=" + salary + "]";
	}
	
	
}
