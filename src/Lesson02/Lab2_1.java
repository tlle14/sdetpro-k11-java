package Lesson02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {

        // Declare
        float yWeight;
        float yHeigh;
        float yBMI;

        // Input weight and heigh
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weigh (kg): ");
        yWeight = scanner.nextFloat();
        System.out.print("Please input your heigh (m): ");
        yHeigh = scanner.nextFloat();

        // Calculate BMI
        yBMI = yWeight / (yHeigh * 2);
        DecimalFormat df = new DecimalFormat("##.#");
        System.out.print("Your BMI is: ");
        System.out.println(df.format(yBMI));

        //<18.5 | 18.5-24.9 | 25-29.9 | >=30
        if (yBMI < 18.5) {
            System.out.println("You're underweight");
        } else if (yBMI <= 24.9) {
            System.out.println("You have a normal weight");
        } else if (yBMI <= 29.9) {
            System.out.println("You're overweight");
        } else {
            System.out.println("You're Obesity");
        }
    }
}
