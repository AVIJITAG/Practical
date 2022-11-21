package OverRide;

class Exam {
    int marks() {
        return 0;
    }
}

class comp extends Exam {
    int marks() {
        return 80;
    }
}

class math extends Exam {
    int marks() {
        return 70;
    }
}

class science extends Exam {
    int marks() {
        return 50;
    }
}

class eng extends Exam {
    int marks() {
        return 90;
    }
}

public class Overridding_example {
    public static void main(String... arg) {
        comp c = new comp();
        math m = new math();
        science s = new science();
        eng e = new eng();

        System.err.println("Computer marks is: " + c.marks());
        System.err.println("math marks is: " + m.marks());
        System.err.println("science marks: " + s.marks());
        System.err.println("ENGLISH marks is: " + e.marks());

    }
}