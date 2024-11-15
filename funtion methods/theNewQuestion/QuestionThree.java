
// 3. Write a function to check whether a given number is even or odd. Return 1 if the
// number is even, otherwise return 0. (TSRS)

import java.util.Scanner;

public class QuestionThree {
    public static int evenOdd(int num) {

        if (num%2 == 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        System.out.println(evenOdd(num));
    }
}
