package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a =50;
		int b =100;
		
		if(b>a) {
			System.out.println("b is greater than a");
		}
		else {
			System.out.println("a is greater than b");
		}
		
		System.out.println("********************************");
		
		//comparison operators
		//<  >  >=  <=  !=
		
		int c=40;
		int d=50;
		
		if(c!=d) {
			System.out.println("c and d are not equal");
		}
		else
		{System.out.println("c and d are equal");
	}
		
		
		System.out.println("*******************************");
		//write a logic to find out the highest number
		int a1=700;
		int b1=500;
		int c1=300;
		
		//nested if
		
		if(a1>b1 & a1>c1) {
			System.out.println("a1 is the greatest");
		}
		else if(b1>c1) {
			System.out.println("b1 is the greatest");
		}
		else{
			System.out.println("c1 is the greatest");
		}
}
}
