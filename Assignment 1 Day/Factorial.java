import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

               System.out.print("Input a number: ");
        int number = scanner.nextInt();

               long factorial = 1;

                for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by i for each iteration
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
