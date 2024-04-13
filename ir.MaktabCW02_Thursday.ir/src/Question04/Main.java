package Question04;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a spy number:");
        int number = scanner.nextInt();

        boolean isSpyNumber = isSpyNumber(number);

        if (isSpyNumber) {
            System.out.println(number + " is a spy number.");
        } else {
            System.out.println(number + " is not a spy number.");
        }
        scanner.close();
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }
}
