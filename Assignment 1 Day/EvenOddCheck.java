import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

               System.out.print("Input a number: ");
        int number = scanner.nextInt();

                if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even.");
        } else {
            System.out.println("The number " + number + " is Odd.");
        }

                scanner.close();
    }
}
