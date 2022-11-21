import java.util.Scanner;

public class User_input {

    public static void main(String[] args) {
        // creating scanner class

        Scanner sc = new Scanner(System.in); // System.in is a standard input stream

        System.out.println("Enter first number_   ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int d = a + b + c;

        System.out.println("TOTAL :=  " + d);
    }
}
