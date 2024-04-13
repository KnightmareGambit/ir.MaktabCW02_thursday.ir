package Question03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a tech number:");
        int number = scanner.nextInt();

        boolean isTechNumber = isTechNumber(number);

        if (isTechNumber) {
            System.out.println(number + " is a tech number.");
        } else {
            System.out.println(number + " is not a tech number.");
        }

        scanner.close();
    }

    public static boolean isTechNumber(int number) {
        String numberStr = String.valueOf(number);
        int length = numberStr.length();

        if (length % 2 != 0) {
            return false;
        }

        int halfLength = length / 2;
        int firstHalf = Integer.parseInt(numberStr.substring(0, halfLength));
        int secondHalf = Integer.parseInt(numberStr.substring(halfLength));

        int sum = firstHalf + secondHalf;
        int squareOfSum = sum * sum;

        return squareOfSum == number;
    }
}
