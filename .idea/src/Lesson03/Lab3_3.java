package Lesson03;

public class Lab3_3 {
    public static void main(String[] args) {
        int myArr[] = {12, 34, 1, 16, 28};
        System.out.print("My array: ");
        showData(myArr);

        sortInc(myArr);
        System.out.print("\nSort by increasing order: ");
        showData(myArr);
    }

    public static void showData(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            System.out.print("[ "+myArr[i]+ " ]");
        }
    }

    public static void sortInc(int[] myArr) {
        for (int i = 0; i < myArr.length; i++) {
            for (int j = i + 1; j < myArr.length; j++) {
                if (myArr[i] > myArr[j]) {
                    int tmp = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = tmp;
                }
            }
        }
    }
}
