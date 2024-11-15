import java.util.Scanner;

public class twentyone {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);

        @SuppressWarnings("unused")
        char str; 
        @SuppressWarnings("unused")
        int sum = 0 ; 
        do {
            System.out.print("Enter :");
            int num1 = obj.nextInt();
            System.out.println("Enter :");
            int num2 = obj.nextInt(); 
           
             sum = num1 + num2 ;
             System.out.println(sum);
             System.out.println("Y/N");
             str = obj.next().charAt(0);
        } while (str == 'Y'|| str == 'y');

    }
}
