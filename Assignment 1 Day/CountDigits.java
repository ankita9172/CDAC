import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

              System.out.print("Input number: ");
        int number = scanner.nextInt();

               int digitCount = 0;

               if (number == 0) {
            digitCount = 1;
        } else {
                       while (number != 0) {
                number /= 10;
                digitCount++;
            }
        }

              System.out.println("The number has " + digitCount + " digits.");
    }
}
