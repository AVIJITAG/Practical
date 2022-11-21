package OverRide;

public class IgnoringCase { // main class
    public static void main(String... args) { // main method

        String str1 = "This is Program 1";
        String str2 = "This is Program 2";

        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);

        // compare the two strings....

        int result = str1.compareToIgnoreCase(str2);

        // Display the results of the comparision......

        if (result < 0) { // if statement
            System.err.println("\"" + str1 + "\"" + "is less then" +
                    "\"" + str2 + "\"");
        }

        else if (result == 0) {
            System.err.println("\"" + str1 + "\"" + "is greater than" + "\"" + str2 + "\"");
        }

    }

}
