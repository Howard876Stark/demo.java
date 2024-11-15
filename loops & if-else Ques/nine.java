import java.util.Scanner;

public class nine {
    public static void main(String[] args) {
        
       @SuppressWarnings("resource")
      Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number :");
           int c = obj.nextInt();

           int fact = 1; 
           for (int i = 1; i <= c; i++){
            
            fact *= i;
           }
           System.out.println("The factorial is :" + fact);
    }
    }

