import java.util.Scanner;

public class PrimeNumberChecker {

    public static void checkPrime(int number) {

        boolean isPrime = true;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number greater than 1: ");
        int number = scanner.nextInt();

        checkPrime(number);
    }
}