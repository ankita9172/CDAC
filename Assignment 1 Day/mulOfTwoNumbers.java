import java.util.Scanner;

public class MultiplyTwoNumbers {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

        // Calculate the product
        int product = firstNumber * secondNumber;

        // Display the result
        System.out.println(firstNumber + " x " + secondNumber + " = " + product);
        
        // Close the scanner
        scanner.close();
    }
}