package src;

public class Multiples {
    public static void main(String[] args) {
        multiples();
    }

    private static void multiples() {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3Or5 = i % 3 == 0 || i % 5 == 0;
            if (divisibleBy3Or5) {
                count+= 1;
            }
        System.out.println(count);
        }
    }
}
