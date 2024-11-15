// Question 3

// Write a value-returning method, isVowel that returns the value true if a given character is a vowel, and otherwise returns false. In main() method accept a string from user and count number of vowels in that string.

import java.util.Scanner;

public class questionThird {
    // FUNTION OF CHECKING THE VOWEL.
    public static boolean isVowel(char check) {

        if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u' || check == 'A' || check == 'E'
                || check == 'I' || check == 'O' || check == 'U') {

            return true;
        } else {

            return false;
        }

    }

    public static void main(String[] args) {

        System.out.print("Enter the letter I will tell you is Vowel or not:");
        @SuppressWarnings("resource")
        Scanner obj = new Scanner(System.in);

        char check = obj.next().charAt(0);
        System.out.println(isVowel(check));

    }
}
