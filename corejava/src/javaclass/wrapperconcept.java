package javaclass;

public class wrapperconcept {
	
	public static void main(String[] args) {
		int a=8;
		Integer s=Integer.valueOf(a);
		System.out.println("s value" +s); //converting int to integer
		
		String r= String.valueOf(a);
		System.out.println("r value" +r); //converting int to string
		
		int n=Integer.valueOf(s);
		System.out.println("n value" +n); //converting integer to int
		
		String p=String.valueOf(r);
		System.out.println("p value" +p); //converting string to string
		
		int t= Integer.valueOf(r);
		System.out.println("t value" +t); //converting string to int
		
		Float g=3.4f;
		String b= String.valueOf(g);
		double y= Double.valueOf(b);
		System.out.println("b value" +b);
		System.out.println(+y);
		double d= 445.5;
		String c=String.valueOf(d);
		System.out.println("c value" +c);
		
		
		
		
		
		
	}

}
