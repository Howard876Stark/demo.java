//4. Write a Java program to calculate the average value of array elements.
public class Avarage_of_Array {
    public static void main(String[] args) {
       
        int sum = 0;
        int[] average = {12,45,36,84};
        for (int i : average) {
            sum += i;
        }
        int result = sum / average.length;
        System.out.println("The avarage of the array is " + result);
    }
}
