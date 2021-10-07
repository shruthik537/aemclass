package javaclass;

public class constructorChaining {
	
	public constructorChaining() {
		// TODO Auto-generated constructor stub
		this(10);
		System.out.println("default constructor");
	}
	
	public constructorChaining(int x) {
		// TODO Auto-generated constructor stub
		this(20,30);
		System.out.println("one parameter constructor");
	}
	
	public constructorChaining(int x,int y) {
		// TODO Auto-generated constructor stub
		System.out.println("two parameter constructor");
	}
	

	public static void main(String[] args) {
		constructorChaining obj= new constructorChaining();
		System.out.println("main method");
		
		
	}
}
