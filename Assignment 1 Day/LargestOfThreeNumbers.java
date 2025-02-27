import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Input first number: ");
        int firstNumber = scanner.nextInt();

        
        System.out.print("Input second number: ");
        int secondNumber = scanner.nextInt();

               System.out.print("Input third number: ");
        int thirdNumber = scanner.nextInt();

                int largest = firstNumber; 
        if (secondNumber > largest) {
            largest = secondNumber;  
        }

        if (thirdNumber > largest) {
            largest = thirdNumber;          }
        System.out.println("The largest number is: " + largest);

       
        scanner.close();
    }
}
