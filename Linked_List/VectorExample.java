package Class16_11_2022;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
	       // creating vector
		Vector<String> vc = new Vector<String>(4);
		// adding elements to a vector
		vc.add("DOG");
		vc.add("CAT");
		vc.add(0, "TIGHER");
		vc.add("LION");
		// checking size & capacity
		System.out.println("Size: "+vc.size());
		System.out.println("Size: "+vc.capacity()); //old cap*3/2 =1
		// add more elements
		vc.addElement("cow");
		vc.addElement("goat");
		System.out.println("After adding elements: ");
		System.out.println("Size: "+vc.size());
		System.out.println("Size: "+vc.capacity());
		//checking cat is presents in the vector or not
		System.out.println(vc);
		if (vc.contains("CAT")) {
			System.out.println("Element present");
		}
		else {
			System.out.println("Elements not presents");
			
		}
		// getting 1st elements
		System.out.println("1st elements: "+vc.firstElement());
		//getting last elements
		System.out.println("last elements: "+vc.lastElement());
		//checking index of specified elements
		System.out.println("index: "+vc.indexOf("CAT"));
	
	}

}
