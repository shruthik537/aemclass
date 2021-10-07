package com.java.studentimpl;

import java.util.*;

import com.java.bean.Student;  
class NameComparator implements Comparator<Student>{  
public int compare(Student s1,Student s2){  
return s1.name.compareTo(s2.name);  
}  
} 