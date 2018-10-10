package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		ar.add("uday");//3
		ar.add('J');//4
		
		System.out.println(ar.size());
		
		ar.add(14.33);//5
		ar.add("jakk");//6
		
		System.out.println(ar.get(2));
		System.out.println(ar.get(3));
		
		ar.add('w');//7
		System.out.println(ar.size());
		
		ar.remove(7);
		System.out.println(ar.size());

		//To print all the values of arraylist: for loop
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(500);
		//ar1.add("udai");
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("kiran");
	}

}
