package OverRide;

public class Addition { // main class
    static int add(int a, int b) { // add method
        return (a + b); // return sum
    }

    static double add(double a, double b) { // double add method
        return (a + b);
    }
}

class overloading { // another class
    public static void main(String[] args) { // main method
        System.err.println(Addition.add(2, 3));
        System.err.println(Addition.add(2.7, 3.3));
    }
}
