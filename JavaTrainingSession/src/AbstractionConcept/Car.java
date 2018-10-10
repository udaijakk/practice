package AbstractionConcept;

public interface Car {
	
	//only final and static vars
	int  wheels =4;
	
	//Always defines only abstract methods
	//no method body
	//only method declaration
	//we achieve 100% abstraction 
	//can not create the object of interface
	
	public void start();
	public void stop();
	public void refuel();

}
