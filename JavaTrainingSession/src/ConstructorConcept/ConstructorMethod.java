package ConstructorConcept;

public class ConstructorMethod {
	//class var---instant var
	String name;
	int age;

	public ConstructorMethod() { //0par
		System.out.println("default cnstr");
	}

	public ConstructorMethod(int a) { //1par
		System.out.println("single var cnstr");
	}

	public ConstructorMethod(int a, int b) { //2 par
		System.out.println("double var cnstr");
	}
	
	public ConstructorMethod(String name, int age) {
		this.name=name; //this.classvar =localvar
		this.age=age;
	}

	public static void main(String[] args) {

		ConstructorMethod obj = new ConstructorMethod();
		ConstructorMethod obj1 = new ConstructorMethod(10);
		ConstructorMethod obj2 = new ConstructorMethod(10, 20);
		ConstructorMethod obj3=new ConstructorMethod("udai", 25);
		ConstructorMethod obj4=new ConstructorMethod("mahesh", 24);
		
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		
		System.out.println(obj4.name+" "+obj4.age);
		

	}

}
