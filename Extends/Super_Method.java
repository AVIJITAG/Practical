class Shape1 {
    void print() { // parent class method
        System.out.println("Print Circle");
    }
}

class Size1 extends Shape1 { // child class
    void print() { // same method of parent class(Child class method)
        System.out.println("Print Triangle");
    }

    void display() { // new method of child class
        System.out.println("print nothing");
    }

    void show() { // final method
        super.print();
        display();
    }

}

public class Super_Method {
    public static void main(String[] args) {

        Size1 obj = new Size1();
        obj.show();

    }
}
