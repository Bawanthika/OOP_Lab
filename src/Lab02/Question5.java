package Lab02;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] words = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter word " + (i + 1) + ": ");
            words[i] = input.next();
        }

        String longestWord = words[0];
        int totalCharacters = 0;

        for (int i = 0; i < 5; i++) {

            // Find longest word
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }

            // Calculate total characters
            totalCharacters = totalCharacters + words[i].length();
        }

        System.out.println("Longest word = " + longestWord);
        System.out.println("Total characters = " + totalCharacters);

        System.out.println("Words with even number of characters:");

        for (int i = 0; i < 5; i++) {

            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }
}