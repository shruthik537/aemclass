package javaclass;



public class globalvariablemethod {

	int x;
	int y;
	
	public globalvariablemethod() {
		// TODO Auto-generated constructor stub
	}
	
	void getglobalvars(int x, int y) {          //method
		this.x=x;
		this.y=y;
		globalvariablemethod obj=new globalvariablemethod(20,30);
		//obj.getglobalvars(3,4);
		System.out.println("x is---" +x+ "y is--" +y);

	}
	public globalvariablemethod(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;

		System.out.println("x value---" +x+ "y value--" +y);
		
	}
	public static void main(String[] args) {
		globalvariablemethod obj=new globalvariablemethod(10,20);
		obj.getglobalvars(1,2);
	}
}
