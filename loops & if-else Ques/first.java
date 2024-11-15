import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        System.out.print("Enter :");
        @SuppressWarnings("resource")
        Scanner obj =new Scanner(System.in);
       int a; 
        a = obj.nextInt();
         
       if (a<16){
        System.out.println("here you can go");
       }else if (a==14) {
        System.out.println("hey you can go");
       }else{
        System.out.println("you can go ");
       }
    }
}
