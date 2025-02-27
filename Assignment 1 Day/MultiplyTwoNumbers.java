import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        // Ask the user for the second number
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        // Calculate the product of the two numbers
        int product = firstNumber * secondNumber;

        // Display the result
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
