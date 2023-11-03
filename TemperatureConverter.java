import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for temperature value
        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        // Prompt user for unit of measurement (Celsius or Fahrenheit)
        System.out.print("Enter unit of measurement (C or F): ");
        String unit = scanner.next();

        double convertedTemperature;

        if (unit.equalsIgnoreCase("C")) {
            // Convert Celsius to Fahrenheit
            convertedTemperature = (temperature * 9 / 5) + 32;
            System.out.println("Converted temperature in Fahrenheit: " + convertedTemperature + " F");
        } else if (unit.equalsIgnoreCase("F")) {
            // Convert Fahrenheit to Celsius
            convertedTemperature = (temperature - 32) * 5 / 9;
            System.out.println("Converted temperature in Celsius: " + convertedTemperature + " C");
        } else {
            // Invalid input
            System.out.println("Invalid unit of measurement. Please enter C or F.");
        }

        scanner.close();
    }
}
