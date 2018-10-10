package OOPConceptPart1;

public class Car {
	
	//global class variables
	String carname;
	int model;

	public static void main(String[] args) {
		
		//new Car(); --- this is the object of car class
		//new keyword is used to create new class
		//a,b,c --- object reference variables
		
		Car a =new Car();
		Car b =new Car();
		Car c =new Car();
		
		a.carname="SUZUKI";
		a.model=2014;
		
		b.carname="BENZ";
		b.model=2015;
		
		c.carname="FERRARI";
		c.model=2016;
		
		System.out.println("before assigning the reference");
		
		System.out.println(a.carname);
		System.out.println(a.model);
		
		System.out.println(b.carname);
		System.out.println(b.model);
		
		System.out.println(c.carname);
		System.out.println(c.model);
		
		System.out.println("after shifting the reference");
		
		a=b;
		b=c;
		c=a;
		  
		a.model= 2014;
		System.out.println(a.model);
		c.model=2015;
		System.out.println(c.model);
		System.out.println(a.model);
	

	}

}
