package Question06;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of movies (1 ≤ n ≤ 10): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if (n < 1 || n > 10) {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
            return;
        }

        String[] movies = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter movie " + (i + 1) + " name: ");
            String movie = scanner.nextLine();
            movies[i] = fixMovieName(movie);
        }

        System.out.println("\nFixed movie names:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        scanner.close();
    }

    public static String fixMovieName(String movie) {
        StringBuilder sb = new StringBuilder();
        boolean isFirstChar = true;

        for (char c : movie.toCharArray()) {
            if (Character.isLetter(c)) {
                if (isFirstChar) {
                    sb.append(Character.toUpperCase(c));
                    isFirstChar = false;
                } else {
                    sb.append(Character.toLowerCase(c));
                }
            } else {
                sb.append(c);
                isFirstChar = true;
            }
        }

        return sb.toString();
    }
}
