package TestMain;

public class TestClass {

	
	//JVM -- main(String[] args) ---public static void
	public static void main(String[] args) {
		System.out.println("main method--1");
		
		main("uday");
		main(24);
		main(50,70);
	}
	
	public static void main(String args) {
		System.out.println("main method--2");
	}
	
	public static void main(int a) {
		System.out.println("main method--3");
	}
	
	public static void main(int a, int b) {
		System.out.println("main method--4");
	}

}
