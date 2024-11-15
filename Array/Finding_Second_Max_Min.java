import java.util.Arrays;

public class Finding_Second_Max_Min {
    public static void main(String[] args) {
        int[] arr = { 14, 15, 26, 4, 35 };

        Arrays.sort(arr);

        int second_max = arr[arr.length - 2];
        int second_min = arr[1];
        System.out.println(second_max);
        System.out.println(second_min);

    }
}
