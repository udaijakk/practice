package JavaBasics;

public class ConstructorConcept {
	
	public ConstructorConcept() {
		System.out.println("default constructor");
	}
	
	public ConstructorConcept(int a) {
		System.out.println("single param constr");
		System.out.println("the value of a "+a);
	}
	
	public ConstructorConcept(int x, int y) {
		System.out.println("double param cnstr");
		System.out.println("the value of x "+x);
		System.out.println("the value of y "+y);
	}

	public static void main(String[] args) {
		
		ConstructorConcept c=new ConstructorConcept();
		ConstructorConcept c1=new ConstructorConcept(10);
		ConstructorConcept c2=new ConstructorConcept(20,30);
		
		

	}

}
