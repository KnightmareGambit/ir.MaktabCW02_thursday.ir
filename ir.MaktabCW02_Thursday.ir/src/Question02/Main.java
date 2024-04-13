package Question02;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        List<String> duplicates = findDuplicateWords(input);

        if (duplicates.isEmpty()) {
            System.out.println("No duplicate words found.");
        } else {
            System.out.println("Duplicate words found:");
            for (String word : duplicates) {
                System.out.println(word);
            }
        }

        scanner.close();
    }

    public static List<String> findDuplicateWords(String input) {
        List<String> duplicates = new ArrayList<>();
        String[] words = input.split("\\s+");
        Arrays.sort(words);

        for (int i = 0; i < words.length - 1; i++) {
            if (words[i].equals(words[i + 1])) {
                duplicates.add(words[i]);
            }
        }

        return duplicates;
    }
}

