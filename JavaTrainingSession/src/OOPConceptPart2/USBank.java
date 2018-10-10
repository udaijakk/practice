package OOPConceptPart2;

public interface USBank {
	
	int min_bal =100;
	
	public void credit();
	
	public void debit();
	
	public void tranferMoney();
	
	
	//only method declaration
	//no method body---only method prototype
	//in interface, we can declare the variables, vars are by default static in nature
	// vars values will not be changed...it's final/constant in nature
	//no static method in Interface
	//no main method in interface
	//we can not create the object of interface
	//interface is abstract in nature
	

}
