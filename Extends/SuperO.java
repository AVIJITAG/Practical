
class Shape { // parent class
    String name = "Circle"; // data member of parent class
}

class Size extends Shape { // child class
    String name = "Triangle"; // data member of child class

    void displayname() { // method
        System.out.println(name);
        System.out.println(super.name);
    }
}

class SuperO {
    public static void main(String[] args) {
        Size obj = new Size();
        obj.displayname();
    }
}