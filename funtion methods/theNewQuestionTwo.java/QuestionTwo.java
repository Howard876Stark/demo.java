
//2 .Write a function to calculate HCF of two numbers. (TSRS)

import java.util.Scanner;

public class QuestionTwo {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        System.out.println("Enter the Second number :");
        int num2 = sc.nextInt();
        System.out.println(hcf(num, num2));
    }

    
    private static int LCM(int num, int num2) {
        
        int a = (num > num2) ? num : num2;
        int i;
        for ( i = a; i <= num * num2; i = i + a) {
            // returns true if both conditions are true
            if (i % num == 0 && i % num2 == 0) {
                break;
            }
            
        }
        return i ;
    }
    private static int hcf(int num, int num2) {
        // HCF (a, b) = (a × b)/ LCM (a, b)
       int hcf = (num*num2)/LCM(num, num2);
       return hcf ;
    }

}