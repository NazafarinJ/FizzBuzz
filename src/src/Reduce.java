package src;

public class Reduce {
    public static void main(String[] args) {
        reduce();
    }

    private static void reduce() {
        int n = 100;
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n -= 1;
            }
            count ++;
        }
        System.out.println(count);
    }
}
