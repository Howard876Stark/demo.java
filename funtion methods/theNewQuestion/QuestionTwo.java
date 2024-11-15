//2.Write a function to calculate simple interest. (TSRS)

import java.util.Scanner;

public class QuestionTwo {
    public static int simpleIntrest(int t,int r ,int p) {
         int simple = t*r*p;
         int result = simple/100;
        return result;
        
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rate of circle :");
        int  r= sc.nextInt();
        System.out.print("Enter the time of circle :");
        int  t= sc.nextInt();
        System.out.print("Enter the principle of circle :");
        int  p= sc.nextInt();

        System.out.println(simpleIntrest(t, r, p));
    }
}
