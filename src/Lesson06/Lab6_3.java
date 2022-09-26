package Lesson06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        String inputString = inputYourString();
        String outputString = cutTheString(inputString);

        // Check if the string is not empty, then print the result
        if (outputString.length() == 0) {
            System.out.println("Doesn't have a number");
        } else {
            System.out.println("Result: " + outputString);
        }
    }

    // Cut numbers to the new string
    private static String cutTheString(String inputString) {
        // Remove the spaces in string - Cannot do with string.replace(" ","")
        char[] myArr = inputString.toCharArray();
        String stringResult = "";
        for (char c : myArr) {
            if (Character.isDigit(c)) {
                stringResult = stringResult.concat(String.valueOf(c));
            }
        }
        return stringResult;
    }

    // Input the string from keyboard
    private static String inputYourString() {
        System.out.print("Please input your string: ");
        Scanner scanner = new Scanner(System.in);
        String yourString = scanner.next();
        return yourString;
    }
}
