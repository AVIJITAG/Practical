class Zoo1 {
    int a = 10;

    void bark() {
        System.out.println("braking");
    }
}

class Cat extends Zoo1 {
    int a = 20;

    void bark() {
        System.out.println("meow");
    }
}

class Dog extends Zoo1 {
    void bark() {
        System.out.println("baff");
    }
}

public class ZOO_ {
    public static void main(String[] args) {
        // refference veriable of parent class with the child class object
        Zoo1 Z;
        Z = new Cat();
        Z.bark();
        System.out.println(Z.a);
        Z = new Dog();
        Z.bark();
    }

}
