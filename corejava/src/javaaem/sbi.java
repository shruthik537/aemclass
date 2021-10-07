package javaaem;

public class sbi extends rbi {
	double rate=10;
	@Override
	void m2() {
		// TODO Auto-generated method stub
		
		System.out.println("deposit:"+deposit);
		System.out.println("tenure:"+tenure);
		System.out.println("age:"+age);
		System.out.println("rate:"+rate);
		
		simpleinterest=deposit*tenure*0.01;
		m1();
		roi=simpleinterest*rate;
		System.out.println("rate of Interest:"+roi);
		
		
		
	}
	
	public static void main(String[] args) {

	rbi a=new sbi();
	a.m2();
	}

}
