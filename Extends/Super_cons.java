// parent class
class Shape2 {
    // constructor of parent class
    public Shape2() {
        System.out.println("hello");
    }
}

class Size2 extends Shape2 { // child class
    // constructor of the child class
    Size2() {
        // invoke immediate parent class constructor line
        super();
        System.out.println("hi _");
    }
}

public class Super_cons {
    public static void main(String[] args) {
        Size2 obj = new Size2();

    }
}
