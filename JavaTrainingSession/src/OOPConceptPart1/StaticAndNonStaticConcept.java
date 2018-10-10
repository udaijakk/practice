package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//global var--the scope of global vars will be available across all the functions with some conditions..  
	
	String name ="uday"; //non static global variable
	static int age=25; //static global variable

	public static void main(String[] args) {
		
		//How to call static methods and vars?
		//1.direct calling		
		sum();
		//2.Calling by classname
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		
		//How to call non static metods and vars?
		StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		
		//can i access static methods by using object reference?  Yes
		obj.sum();//warning will be given

	}
	
	public void sendmail() { // non static method
		System.out.println("send mail method");
	}
	
	public static void sum() { // static method
		System.out.println("sum method");
	}

}
