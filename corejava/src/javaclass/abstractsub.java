package javaclass;

public class abstractsub extends abstractconcept{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("M2 in sub class business logic here");
		
	}
public static void main(String[] args) {
	//employsub obj=new employsub();
	abstractconcept obj=new abstractsub(); //abstract class object creation
	obj.m1();
	obj.m2();
}
}
