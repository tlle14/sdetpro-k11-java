package Lesson05;

import jdk.nashorn.internal.ir.WhileNode;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.*;

public class Lab05 {
    public static void main(String[] args) {
        Boolean isContinuing = true;
        List<Integer> myList = new ArrayList<>();
        initList(myList);

        while (isContinuing) {
            menuDisplay();
            System.out.print("Please select: ");
            int userSelection = yourInput();

            switch (userSelection) {
                case 1:
                    addNumber(myList);
                    break;
                case 2:
                    printNumbers(myList);
                    break;
                case 3:
                    getMaximum(myList);
                    break;
                case 4:
                    getMinimum(myList);
                    break;
                case 5:
                    searchNum(myList);
                    break;
                case 6:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Unknown Command. Try again!");
            }
        }
    }

    //0. Menu
    private static void menuDisplay() {
        System.out.println("\n======MENU======");
        System.out.println("1. Add number ");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");
        System.out.println("5. Search number");
        System.out.println("6. Quit");
    }

    //0. Input a number from keyboard
    private static int yourInput() {
        Scanner scanner = new Scanner(System.in);
        int yourNum = scanner.nextInt();
        return yourNum;
    }

    // 0. Initial a random list of number
    private static void initList(List<Integer> myList) {
        myList.add(new SecureRandom().nextInt(100));
        myList.add(new SecureRandom().nextInt(100));
        myList.add(new SecureRandom().nextInt(100));
        myList.add(new SecureRandom().nextInt(100));
    }

    // 1. Add a number to the list
    private static void addNumber(List<Integer> myList) {
        System.out.println("\n---");
        System.out.print("Please input a number: ");
        int newNum = yourInput();
        myList.add(newNum);
        System.out.printf("Added %d to the list successfully!!!\n", newNum);
    }

    // 2. Print the current list
    private static void printNumbers(List<Integer> myList) {
        System.out.println("Your current list is: ");
        System.out.println(myList);
    }

    // 3. Get the maximum number
    private static void getMaximum(List<Integer> myList) {
        int maxNumber = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (maxNumber < myList.get(i)) {
                maxNumber = myList.get(i);
            }
        }
        System.out.printf("Maximum number is %d\n", maxNumber);
    }

    // 4. Get the minimum number
    private static void getMinimum(List<Integer> myList) {
        int minNumber = myList.get(0);
        for (int i = 1; i < myList.size(); i++) {
            if (minNumber < myList.get(i)) {
                minNumber = myList.get(i);
            }
        }
        System.out.printf("Maximum number is %d\n", minNumber);

    }

    // 5. Search a number
    private static void searchNum(List<Integer> myList) {
        System.out.print("Enter the keyword: ");
        int searchKeyword = yourInput();

        for (int checkP = 1; checkP <= myList.size(); checkP++) {
            if (searchKeyword == myList.get(checkP - 1)) {
                System.out.printf("Your number is at position: %d\n", checkP);
            } else if (checkP == myList.size()) {
                System.out.println("Not found!!!");
            }
        }
    }









}
