package Java_Variable;

public class VariableType {
	static int a = 10;                                                            // static variable
	void fun() {
		int b = 10;                                                               // local variable
		System.out.println(a+ " "+b);
		++a;    ++b;
	}
	public static void main (String ...args) {
		VariableType ref = new VariableType();
		ref.fun();
		ref.fun();
	}

}
