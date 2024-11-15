import java.util.Scanner;

public class fiveteen {
    public static void main(String[] args) {
       int rem = 0; 
       @SuppressWarnings("resource")
      Scanner obj = new Scanner(System.in);
       System.out.print("Enter the number : ");
    int num1 = obj.nextInt();
    while (num1 > 0){
         rem = num1 % 10 ;
         num1 = num1 / 10;
       } System.out.println(rem);
    }
}
