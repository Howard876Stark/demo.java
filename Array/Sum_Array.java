//2. Write a Java program to sum values of an array.
public class Sum_Array {
    public static void main(String[] args) {
        int sum=0;
        int[] arr = { 53, 53, 76, 13, 42, 34 };

        for (int i : arr) {
            sum+=i;
        }
        System.out.println(sum);

    }
}
