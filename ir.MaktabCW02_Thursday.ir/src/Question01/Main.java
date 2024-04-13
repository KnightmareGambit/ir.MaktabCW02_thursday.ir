package Question01;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to check if it's a sunny number:");
        int number = input.nextInt();
        boolean isSunny = isSunnyNumber(number);

        if (isSunny) {
            System.out.println(number + " is a sunny number.");
        } else {
            System.out.println(number + " is not a sunny number.");
        }
        input.close();
    }

    public static boolean isSunnyNumber(int number) {
        return isPerfectSquare(number + 1);
    }

    public static boolean isPerfectSquare(int number) {
        double sqrt = Math.sqrt(number);
        return sqrt == Math.floor(sqrt) && !Double.isInfinite(sqrt);
    }
}
