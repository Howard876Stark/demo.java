public class questionfive {
    public static void main(String[] args) {

        System.out.println(isPalindrom(121));
     

    }

    @SuppressWarnings("unused")
    public static boolean isPalindrom(int num) {

        int copy = num;
        int rem;
        int revers = 0;

        for (int i = 0; copy > 0; i++) {
            rem = copy % 10;
            copy = copy / 10;
            revers = revers * 10 + rem;
        }

        if (revers == num) {
            return true;
        } else {
            return false;
        }
    }

}
