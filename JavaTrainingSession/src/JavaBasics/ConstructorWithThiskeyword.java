package JavaBasics;

public class ConstructorWithThiskeyword {
	
	String name;
	int age;
	
	public ConstructorWithThiskeyword(String name, int age) {
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ConstructorWithThiskeyword obj=new ConstructorWithThiskeyword("udai",25);
		

	}

}
