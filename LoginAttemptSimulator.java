import java.util.Scanner;

public class LoginAttemptSimulator {

    public static void simulateLogin(String correctCode, String[] attempts) {

        boolean accessGranted = false;

        for (int i = 0; i < attempts.length; i++) {

            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                accessGranted = true;
                break;
            }
        }

        if (!accessGranted) {
            System.out.println("Access denied - all attempts used");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set the correct access code: ");
        String correctCode = scanner.nextLine();

        String[] attempts = new String[3];

        System.out.println("You have 3 login attempts.");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter attempt " + (i + 1) + ": ");
            attempts[i] = scanner.nextLine();
        }

        simulateLogin(correctCode, attempts);
    }
}