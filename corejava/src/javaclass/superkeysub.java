package javaclass;

public class superkeysub extends superkeywordconcept {
	
	public superkeysub() {
		
		// TODO Auto-generated constructor stub
		//default constructor
		super();  //calling default constructor
		System.out.println("this is sub class");
	}
	public superkeysub(int x) {
		// TODO Auto-generated constructor stub
		//one parameter constructor
		super(x); //calling one param constructor
		System.out.println(" this is superkeysub");
		
		
	}

	void addsub() {
		String n=super.name;//accessing parent variable using super. can be written as n=super.name;
		
		System.out.println("n value is"+n);
		//super.addsuper();
		String wel=super.addsuper();
		System.out.println("welcome" +wel);
	}
	public static void main(String[] args) {
		superkeysub obj=new superkeysub();
		
		
		//obj.addsub();
		//obj.addsuper();
		
		
		
		
	}
	private void superkeywordconcept() {
		// TODO Auto-generated method stub
		
	}
}
