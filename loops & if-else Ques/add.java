import java.util.Scanner;

public class add {
    public static void main(String[] args) {

        // making a object
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // Taking an input 
        System.out.print("Enter how many number did you have for add :");
        int how = sc.nextInt();
        int add = 0 ;
         
       // making loop for adding number 
       for (int index = 0; index < how; index++) {
        System.out.print("Enter your number for calcultion :");
        int one = sc.nextInt();
        
        // resulting number
        add = one + add ;
       }
        
       //displaying answer
       System.out.println("Youe answer is : " + add);

    }
}
