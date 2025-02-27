import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

       
        System.out.print("Input number: ");
        int number = scanner.nextInt();

               boolean isPrime = true;

               if (number <= 1) {
            isPrime = false;
        } else {
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

      
        if (isPrime) {
            System.out.println("The number " + number + " is Prime.");
        } else {
            System.out.println("The number " + number + " is not Prime.");
        }
    }
}
