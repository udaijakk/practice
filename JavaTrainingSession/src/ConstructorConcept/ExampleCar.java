package ConstructorConcept;

public class ExampleCar {
	String name;
	int price;
	String color;
	String modelnumber;
	
	public ExampleCar(String name, int price, String color, String modelnumber) {
		this.name=name;
		this.price=price;
		this.color=color;
		this.modelnumber=modelnumber;
		
	}

	public static void main(String[] args) {
		ExampleCar obj1=new ExampleCar("BMW", 5, "white", "er355");
		ExampleCar obj2=new ExampleCar("audi", 7, "black", "er456");
		ExampleCar obj3=new ExampleCar("honda", 9, "grey", "er678");
		
		System.out.println(obj1.name+" "+obj1.price+" "+obj1.color+" "+obj1.modelnumber);
		System.out.println(obj2.name+" "+obj2.price+" "+obj2.color+" "+obj2.modelnumber);
		System.out.println(obj3.name+" "+obj3.price+" "+obj3.color+" "+obj3.modelnumber);

	}

}
