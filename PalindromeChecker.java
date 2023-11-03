import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();

        // Remove spaces and punctuation from the input and convert to lowercase
        String cleanedInput = input.replaceAll("[\\s.,?!']", "").toLowerCase();

        // Check if the cleaned input is a palindrome
        boolean isPalindrome = true;
        int left = 0;
        int right = cleanedInput.length() - 1;

        while (left < right) {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }

        scanner.close();
    }
}
