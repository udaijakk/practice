package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank {// we are achieving multiple inheritance
	//Is-a relationship

	
	//if a class is implementing any interface, then it is mandatory to define/override all the methods of interface
	//Overriding from USBank 
	public void credit() {
		System.out.println("hsbc---credit");
	}
	
	public void debit()  {
		System.out.println("hsbc----debit");
	}
	
	public void tranferMoney() {
		System.out.println("hsbc----transfermoney");
	}
	
	//separate of HSBCBank class
	public void netbanking() {
		System.out.println("hsbc----netbanking");
	}
	
	public void mobilebanking() {
		System.out.println("hsbc----mobilebanking");
	}
	
	//Overriding from BrazilBank 
	public void mutualfund() {
		System.out.println("hsbc-----mutualfund");
	}
	
}
