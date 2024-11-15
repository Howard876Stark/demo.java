import java.util.Scanner;

public class fourteen {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);  
        System.out.print("enter nunber 1 :");
        int num1 = obj.nextInt();
        System.out.print("enter number 2 :");
        int num2 = obj.nextInt();

        int result = 1;
        for (int i = 1; i <= num2; i++) {
            result *= num1;
        }        
        System.out.println("result : " + result);
    }
}
