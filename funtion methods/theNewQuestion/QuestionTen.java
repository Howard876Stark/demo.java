// 10. Write a function to print all prime factors of a given number. For example, if the
// number is 36 then your result should be 2, 2, 3, 3. (TSRN)

import java.util.Scanner;

public class QuestionTen {
    public static void primeFactor(int num) {
        int num2 = num;

        while (num2 > 1) {
            if (num2 % 2 == 0) {
                num2 = num2 / 2 ;
                System.out.println("2");

            } else if (num2 % 3 == 0){
                num2 = num2 / 3 ;
                System.out.println("3");
                
            }  else if (num2 % 5 == 0){
                num2 = num2 / 5 ;
                System.out.println("5");

            } else if (num2 % 7 == 0){
                num2 = num2 / 5 ;
                System.out.println("7");
                
            } else if (num2 % 11 == 0){
                num2 = num2 / 11 ;
                System.out.println("11");

            } else {
                System.out.println(num2);
                break ;
            }
            
        }
        
    }  


    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        primeFactor(num);
    }
}
