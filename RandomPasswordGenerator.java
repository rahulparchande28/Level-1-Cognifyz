import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for password length
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        // Prompt user for character types
        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecialCharacters = scanner.next().equalsIgnoreCase("yes");

        // Define character sets based on user preferences
        String numbers = "0123456789";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialCharacters = "!@#$%^&*()-_+=<>?";

        // Create character pool based on user preferences
        StringBuilder characterPool = new StringBuilder();
        if (includeNumbers) characterPool.append(numbers);
        if (includeLowercase) characterPool.append(lowercaseLetters);
        if (includeUppercase) characterPool.append(uppercaseLetters);
        if (includeSpecialCharacters) characterPool.append(specialCharacters);

        // Generate random password
        StringBuilder password = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterPool.length());
            char randomChar = characterPool.charAt(randomIndex);
            password.append(randomChar);
        }

        // Display the generated password
        System.out.println("Generated Password: " + password.toString());

        scanner.close();
    }
}
