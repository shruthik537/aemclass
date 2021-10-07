package javaclass;

public class constructorconcept {
	int x;           //global variables initialized nothing but object initialized
	int y;
	int a;
	String name;
	
	
	public constructorconcept(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		
	}
	public constructorconcept(int a, String name) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.name=name;
	}
	public static void main(String[] args) {
		constructorconcept obj=new constructorconcept(10,20);
		constructorconcept objs=new constructorconcept(30,40);
		System.out.println("Object data----"+obj.x);
		System.out.println("Object data----"+obj.y);
		System.out.println("Object data----"+objs.x);
		System.out.println("Object data----"+objs.y);
		
		
		
		
	}

}
