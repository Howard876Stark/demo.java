import java.util.Scanner;

public class thirdteen {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int num;
        char input;

        do {
        System.out.print("enter the number : ");
        num = obj.nextInt();
        
        if(num % 2 == 0){
            //even number 
            even  += num;
        } else{
            //odd number
            odd +=num;
        }


        System.out.println("do you want to continue press Y/N");
        input = obj.next().charAt(0);
        } while (input == 'y' || input == 'Y');
      
        System.out.println("sum of even numbers :" + even);
        System.out.println("sum of odd numbers :" + odd);
    }
}
