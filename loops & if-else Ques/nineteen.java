
import java.util.Scanner;

public class nineteen {
    public static void main(String[] args) {
        System.out.println(" Enter the number one :");
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in) ;
            int dividend = obj.nextInt();
            System.out.println("Enter the number two :");
            int divisior = obj.nextInt();
            int rem, hcf = 0;

            do {
                rem = dividend % divisior;
                if (rem == 0) {
                    hcf = divisior;
                } else {
                    dividend = divisior;
                    divisior = rem;
                }
            } while (rem < 0);

            System.out.println("The hcf is : " 
            + hcf);

    
        
    }
}
