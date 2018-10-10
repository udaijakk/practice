package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		
		LinkedList<String> ll=new LinkedList<String>();
		
		//add
		ll.add("ross");
		ll.add("rachel");
		ll.add("Chandler");
		ll.add("Monica");
		ll.add("joey");
		ll.add("pheobe");
		
		//print
		System.out.println("content of linkedlist" + ll);
		
		//addFirst
		ll.addFirst("friends");
		
		//addLast
		ll.addLast("gunter");
		
		System.out.println("content of linkedlist" +ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set
		ll.set(0, "gunther");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist" +ll);
		
		ll.remove(2);
		System.out.println("content of linkedlist" +ll);
		
		//how to print all the values of linkedlist
		//for loop
		System.out.println("**********");
		for(int n=0; n<ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		
		//advance for loop
		System.out.println("**********");
		for(String str:ll) {
			System.out.println(str);
		}
		
		//iterator
		System.out.println("**********");
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//while loop
		System.out.println("**********");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		

	}

}
