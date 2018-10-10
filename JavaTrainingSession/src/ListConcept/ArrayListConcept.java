package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		
		int a[]=new int[3];//static array---size is fixed
		
		//dynamic array -- ArrayList
		//1.can cantain duplicate values/elements
		//2.maintains insertion order
		//3.synchronized
		//4.allows random access to fetch the element because it stores the values on the basis of indexes
				
		ArrayList ar=new ArrayList();
		
		ar.add(100);
		ar.add(200);
		
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		ar.add("udai");
		ar.add(34.56);
		ar.add('w');
		ar.add(true);
		
		System.out.println(ar.size()); //size of arrayList
		System.out.println(ar.get(5));
		
		//to print all the values from arraylist
		//1.for loop
		//2.iterator
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//non-generic or generic
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("jakk");
		
		ArrayList<E> ar3=new ArrayList<E>();
		
		
		//Employee class objects
		Employee e1=new Employee("ross", 25, "musium");
		Employee e2=new Employee("monica", 24, "cook");
		Employee e3=new Employee("joey", 23, "actor");
		
		//create arraylist
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("********************");
		
		
		//addAll
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("test");
		ar5.add("selenium");
		ar5.add("qtp");
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("admin");
		
		ar5.addAll(ar6);
		
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		System.out.println("***********************");
		
		//removeAll
		ar5.removeAll((ar6));
		for(int i=0; i<ar5.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		System.out.println("***********************");
		
		//retainAll
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("test");
		ar7.add("selenium");
		ar7.add("qtp");
		
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("test");
		ar8.add("java");
		ar8.add("admin");

		ar7.retainAll((ar8));
		for(int i=0; i<ar7.size(); i++) {
			System.out.println(ar.get(i));

	}

}}
