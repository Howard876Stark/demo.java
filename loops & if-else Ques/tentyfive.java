import java.util.Scanner;

public class tentyfive {
    public static void main(String[] args) {
        // Question 15

        // Write a program to calculate the sum of following series where n is input by
        // user.
        // 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
        // Scanner obj = new Scanner(System.in);
        // System.out.println("Enter the number :");
        // int n = obj.nextInt();
        // double sum = 0; 
        // for (int i = 1; i <= n; i++) {
        //  sum+=1.0/i;
        // }
        // System.out.println("sum = " + sum);
        
    
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = obj.nextInt();
        double sum = 0; 
        for (int i = 1; i <= n; i++) {
            if (i%2 == 0){
         sum-=1.0/i;
        }else {
            sum+=1.0/i;
        }
    }
    System.out.println("sum = " + sum);
    
}}
