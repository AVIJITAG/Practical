
public class OverRidding { // creating parent class
    void run() {
        System.out.println("On ");
    }

}

class TestOverRidding extends OverRidding {

    // defining same name method as its declared in

    void run() {
        System.out.println("off ytdy");
    }

    public static void main(String... argd) {

        TestOverRidding obj = new TestOverRidding(); // obj
        obj.run();
    }
}
