import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     
            @SuppressWarnings("resource")
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number :");
        int b = sc.nextInt();

        int result = 0;

        System.out.print("Enter the a if you want to add ; s if you want to subtract ; m if you want to multiply ; d if you want to divide :");
        char choice = sc.next().charAt(0);

        if (choice == 'a'|| choice == 'A') {
            result = a + b;
        } else if (choice == 's' || choice == 'S') {
            result = a - b;
        } else if (choice == 'm'||choice == 'M') {
            result = a * b;
        } else if (choice == 'd' || choice == 'D') {
            result = a / b;
        } else {
            System.out.println("Enter correct input. ");
        }

        System.out.println(result);

      
       

    }
}
