import java.util.Arrays;

public class Finding_Duplicate_String {

    public static void main(String[] args) {
        String[] my_array = { "Tony", "Tony", "Ram", "Ram" };
        System.out.println(Arrays.toString(my_array));
        for (int i = 0; i < my_array.length - 1; i++) {
            int j = i + 1;
            if (my_array[i] == my_array[j] && i != j) {
                System.out.println("Duplicate is " + my_array[j]);
            }
            j++;
        }

    }
}
