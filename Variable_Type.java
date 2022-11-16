package Java_Variable;

public class Variable_Type {
	
	    static int B = 20;                                        // static variable -
	    int C = 30;                                              // inatance variable - 
	    
	    public static void main(String ...args) {
	    	int A = 10;                                        // Local variable -
	    
	    	Variable_Type ref = new Variable_Type();
	    	System.out.println(A);
	    	System.out.println(Variable_Type.B);
	    	System.out.println(ref.C);
	    }

}
