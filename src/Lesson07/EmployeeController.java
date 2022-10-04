package Lesson07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EmployeeController {

    public int totalSalary(List<Employee> employeeList){
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void main(String[] args) {
        System.out.print("Please input number of Fulltime Employee: ");
        int fulltimeNumber = new EmployeeController().inputNumber();

        System.out.print("Please input number of Contract Employee: ");
        int contractEmployee = new EmployeeController().inputNumber();

        List<Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < fulltimeNumber; i++) {
            employeeList.add(new Fulltime());
        }
        for (int j = 0; j < contractEmployee; j++) {
            employeeList.add(new Contract());
        }

        int totalSalary = new EmployeeController().totalSalary(employeeList);
        System.out.println("\nTotal Salary is: " + totalSalary);
    }
}
