import java.util.Scanner;

public class twentyfour {
    public static void main(String[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        char choise;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do {
            
            System.out.println("Enter the  number :");
            int num =  sc.nextInt();

            if (num > largest){
                largest = num;
            }else if (num < smallest){
                smallest = num;
            }else {
                System.out.println("Error Error String is not allowed...........!");
            }

            System.out.println("Y/N");
            choise = sc.next().charAt(0);
        } while (choise == 'Y'|| choise == 'y');

        System.out.println("largest : " + largest);
        System.out.println("smallest : "+ smallest);
    }
}
