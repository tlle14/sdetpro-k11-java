package Lesson02;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter an integer here: ");
        float yNumber = scanner.nextFloat();

        if (yNumber % 2 == 0) {
            System.out.printf("It's an even number!");
        } else if (yNumber % 2 == 1){
            System.out.printf("It's is an odd!");
        } else {
            System.out.println("Your number is not an integer");
        }
    }
}
