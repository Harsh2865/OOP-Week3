public class SkipMultiplesPrinter {

    public static void printSkippingMultiplesOfThree() {

        System.out.println("Numbers from 1 to 20 excluding multiples of 3:");

        for (int i = 1; i <= 20; i++) {

            if (i % 3 == 0) {
                continue;
            }

            System.out.println(i);
        }
    }

    public static void main(String[] args) {

        printSkippingMultiplesOfThree();
    }
}