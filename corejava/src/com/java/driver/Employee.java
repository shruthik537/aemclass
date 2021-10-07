package com.java.driver;

import java.util.HashSet;
import java.util.Set;



public class Employee {

    Integer empid;
    String name;
    Double salary;
    
 public Employee(Integer empid, String name, Double salary) {
  super();
  this.empid = empid;
  this.name = name;
  this.salary = salary;
 }

 @Override
 public String toString() {
  return "Employee [empid=" + empid + ", name=" + name + ", salary="
    + salary + "]";
 }

/* @Override
 public boolean equals(Object obj) {
  if (this == obj)
   return true;
  if (obj == null)
   return false;
  if (getClass() != obj.getClass())
   return false;
  Employee other = (Employee) obj;
  if (empid == null) {
   if (other.empid != null)
    return false;
  } else if (!empid.equals(other.empid))
   return false;
  return true;
 }*/
    






 public static void main(String[] args) {
  Employee employee1 = new Employee(100, "Dinesh", 5000.0);
  Employee employee2 = new Employee(100, "Dinesh", 5000.0);
  Employee employee3 = new Employee(101, "Arnav", 6000.0);
  
  Set<Employee> set = new HashSet<Employee>();
  set.add(employee1);
  set.add(employee2);
  set.add(employee3);
  Employee employee =(Employee) set;
	  
	  if(employee1.empid==employee2.empid) {
           System.out.println("duplicate value");
      }else if(employee1.empid==employee3.empid){
	       System.out.println("duplicate value1");
      }else if(employee2.empid==employee3.empid){
	       System.out.println("duplicate value2");
      }else {
	       System.out.println(employee);
      }
  }
 }

 
 
 /*@Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + ((empid == null) ? 0 : empid.hashCode());
  result = prime * result + ((name == null) ? 0 : name.hashCode());
  result = prime * result + ((salary == null) ? 0 : salary.hashCode());
  return result;
 }*/
