package Class16_11_2022;

import java.util.ArrayList;

public class LamdaEg {
	public static void main (String ...aaa) {
		ArrayList <Integer>num = new ArrayList<Integer>();
		num.add(5);
		num.add(4);
		num.forEach((val)->{System.out.println(val);});
	}

}
