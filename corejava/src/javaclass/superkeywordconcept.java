package javaclass;

public class superkeywordconcept {

	String name="hello";

	public superkeywordconcept() {
		// TODO Auto-generated constructor stub
		//default constructor
		System.out.println("called from subclass");
	}
	
	public superkeywordconcept(int x) {
		// TODO Auto-generated constructor stub
		//one parameter constructor
		System.out.println("x value is initialized from sub constructor"+x);
	}
	
	
	//void addsuper()
	String addsuper(){
		System.out.println("i am from addsuper method");
		return "welcome";
	}
}
