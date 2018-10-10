package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj= new MethodOverloading();
		
		obj.sum();
		obj.sum(12.33);
		obj.sum(10);
		obj.sum(50, 100);
	}
	
	public static void main(int a) {
		
	}
	
	public static void main(int a, int b) {
		
	}
	
	//we can overload main method also
	//we can not create a method inside a method
	//duplicate methods..i.e., same method name with same no of arguments are not allowed.
	
	
	//method overloading.... when the method name is same with the different arguments or parameters with in the same class
	public void sum() {// 0 input param
	System.out.println("sum method... 0 param");
	}
	
	public void sum(double d) { // 1 input param
		System.out.println("sum method.... 0 param");
		System.out.println(d);
	}
	public void sum(int a) { //1 input param
		System.out.println("sum method.... 1 input param");
		System.out.println(a);
	}
	
	public void sum(int a, int b) { // 2 input param
		System.out.println("sum method.... 2 input param");
		System.out.println(a+b);
	}

}
