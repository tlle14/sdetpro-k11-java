package Lesson03;

public class Lab3_1 {
    public static void main(String[] args) {

        int intArr[] = {1, 2, 3, 4, 5};
        int countEven = 0;
        int countOdd = 0;

        for (int index = 0; index < intArr.length; index++){
            if (intArr[index] % 2 == 0) {
                countEven = countEven + 1;
            } else {
                countOdd = countOdd + 1;
            }
        }

        System.out.printf("Even numbers: %d\n", countEven);
        System.out.printf("Odd numbers: %d", countOdd);
    }
}
