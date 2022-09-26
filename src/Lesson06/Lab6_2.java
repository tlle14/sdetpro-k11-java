package Lesson06;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        int inputTime = 1;
        String myPassword = "password123";
        System.out.print("Please input your password: ");

        do {
            String password = inputPassword();
            if (password.equals(myPassword)) {
                System.out.println("Correct Password");
                break;
            } else if (inputTime < 3) {
                System.out.print("Incorrect Password! Please enter your password again: ");
                inputTime++;
            } else {
                System.out.println("Incorrect Password! Out of service. ");
            }
        }
        while (inputTime <= 3);
    }

    private static String inputPassword() {
        Scanner scanner = new Scanner(System.in);
        String inputPwd = scanner.next();
        return inputPwd;
    }
}
