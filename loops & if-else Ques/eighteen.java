public class eighteen {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("before swap a : " + a);
        System.out.println("before swap b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("after swap a :" + a);
        System.out.println("after swap b :" + b);

    }
}
