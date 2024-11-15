import java.util.Arrays;

public class Coping_Array {
    public static void main(String[] args) {

        int[] Arr = { 57, 65, 23, 78, 59, 89, 45, 54, 879, 123 };

        int[] Copy = new int[Arr.length];

        for (int i = 0; i < Arr.length; i++) {
            Copy[i] = Arr[i];
        }

        System.out.println("This is orignal array " + Arrays.toString(Arr));
        System.out.println("This is copied array " + Arrays.toString(Copy));

    }
}