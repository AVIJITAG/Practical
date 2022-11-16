package Class_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Example {

	public static void main(String[] args) {                    // main method
	
		LinkedList<String> ll = new LinkedList<String>();      // create list
		
		ll.add("A");                                             // add the list
		ll.add("V");
		ll.add("I");
		ll.add("J");
		ll.add("I");
		ll.add("T");
		
		Iterator<String>itr = ll.iterator();                   //iterator create
		
		while(itr.hasNext())
		System.out.print(itr.next());                        // print 
		
	}

}
