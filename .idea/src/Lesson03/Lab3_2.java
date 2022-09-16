package Lesson03;

public class Lab3_2 {
    public static void main(String[] args) {
        int intArr[] = {4, 1, 2, 5, 3};

        // Print out the result
        System.out.printf("Minimum number is: %d\n", minNum(intArr));
        System.out.printf("Maximum number is: %d ", maxNum(intArr));
    }

    // Find minimum number
    public static int minNum(int[] intArr) {
        int minNumber = intArr[0];
        for (int index = 0; index < intArr.length; index++) {
            if (minNumber > intArr[index]) {
                minNumber = intArr[index];
            }
        }
        return minNumber;
    }

    // Find maximum number
    public static int maxNum(int[] intArr) {
        int maxNumber = intArr[0];
        for (int index = 0; index < intArr.length; index++) {
            if (maxNumber < intArr[index]) {
                maxNumber = intArr[index];
            }
        }
        return maxNumber;
    }
}