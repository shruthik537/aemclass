package javaclass;

public class switchcase {
	public static void main(String[] args) {
		/*int a=10;
		switch (a) {
		case 10:
			System.out.println("a is integer value"+a);
			break;
		case 20:
			System.out.println("a is integer value"+a);
		
						break;

		default:
			System.out.println("default value");
			break;
		}*/
		
		
		int day=2;
		 String daytype;
		 String dayString;
		 
		 switch(day) {
		 case 1:
			 dayString="Monday";
			 break;
		
		 case 2:
			 dayString="Tuesday";
			 break;
		
		 case 3:
			 dayString="Wednesday";
			 break;
		
		 case 4:
			 dayString="Thursday";
			 break;
		
		 case 5:
			 dayString="Friday";
			 break;
		
		 case 6:
			 dayString="Saturday";
			 break;
		
		 case 7:
			 dayString="Sunday";
			break;
		
		 default:
			 dayString="Invalid";
		}
		 switch(day) {
		 //multiple cases without break statement
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			daytype="weekday";
			break;
		case 6:
		case 7:
			daytype="weekend";
			break;
		 
		 default:
			 daytype="invalid daytype";
	}
		 System.out.println(dayString+ "is a " +daytype );
	
			
		 }
		 
	}
	


