package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		
		h.put('a', "rach");
		h.put("udai", "kiran");
		h.put("P", "ross");
		
		System.out.println(h.size());
		
		h.put(1, 10000);
		h.put(2, 20000);
		
		System.out.println(h.size());
		System.out.println(h.get(2));
		System.out.println(h.get("udai"));
		
		h.put(1, "jakka");
		
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(1, 1000);
		
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		h2.put(5, "juday");
		
		System.out.println(h2.get(5));


	}

}
