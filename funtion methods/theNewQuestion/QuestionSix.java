//6 .Write a function to calculate the factorial of a number. (TSRS)

import java.util.Scanner;

public class QuestionSix {
    public static int factorial(int num) {

        int factorial = 1;
        for (int i = 1; i < num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for the factorial :");
        int num = sc.nextInt();

        System.out.println(factorial(num));
    }
}
