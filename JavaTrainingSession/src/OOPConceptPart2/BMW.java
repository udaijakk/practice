package OOPConceptPart2;

public class BMW extends Car{ //"has-a relationship"
	
	
	//when same method is present in parent class as well as in child class with the same name and same no of arguments is called Method-overriding
	
	public void start() { // overridden method
		System.out.println("BMW----start");
	}
	
	public void theftsafety() {
		System.out.println("BMW----theftsafety");
	}

}
