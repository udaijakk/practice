package JavaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		
		//1. while loop:
		//disadvatage of while is -- it will generate infinite loop if you don't give incremental/decremental part
		//print 1 to 10
		
		int i=1; //intialization
		while(i<=10) { //conditional
		System.out.println(i); 
		i=i+1;  //incremental/decremental
	}
		
		
		
		System.out.println("###############");
		
		//2.for loop:
		//j++ means j=j+1
		//print 1 to 10
		
		for(int j=1; j<=10; j++) {
		System.out.println(j);
	}
		
		System.out.println("@@@@@@@@@@@@@@@");
		
		
		//print 10 to 1
		
		for(int k=10; k>=-20; k-- ) {
			System.out.println(k);
		}
		
		
}
}
