package AbstractionConcept;

public abstract class Bank {
	
	int amt=100;
	final int rate=10;
	String a ="udai";
	
	//partial abstraction
	//hiding the implementation logic--- is called Abstraction (OOP concept)
	//Abs can have abs methods and non abs methods
	//can not create the object of abstract classes
	
	public abstract void loan(); //abstract method --- no method body
	
	
	//non abstract methods
	public void credit() {
		System.out.println("Bank---credit");
	}
	
	public void debit() {
		System.out.println("Bank---debit");
	}

}
