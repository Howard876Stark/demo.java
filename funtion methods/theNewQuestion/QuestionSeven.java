//7. Write a function to calculate the number of combinations one can make from n items
// and r selected at a time. (TSRS)

//formula = n! / (n-r)! * r!

import java.util.Scanner;
//n=7,r=5
//n! / (n-r)! *r!
//6*7
//-----
//(7-5)! 
// 42
//----
//1*2
// 42
//----
// 2
//21


public class QuestionSeven {

    public static int combination(int n, int r) {
        int factorial = 1;

        int nf;
        int rf;
        int subNRf;
        int subNR = n - r;
        int result;

        // the factorial of n
        for (int i = 1; i < n; i++) {
            factorial = factorial * i;
        }
        nf = factorial;

        // the factorial of r
        for (int i = 1; i < r; i++) {
            factorial = factorial * i;
        }
        rf = factorial;

        // the factorial of n-r

        for (int i = 1; i < subNR; i++) {
            factorial = factorial * i;
        }
        subNRf = factorial;

        

        result = nf / subNRf * rf;
        return result;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n for the number combination:");
        int n = sc.nextInt();
        System.out.println("Enter the r for the number combination:");
        int r = sc.nextInt();

        System.out.println(combination(n, r));
    }
}
