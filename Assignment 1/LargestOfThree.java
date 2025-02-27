public class LargestOfThree {
    public static void main(String[] args) {
        int num1 = 10; // You can change this value
        int num2 = 20; // You can change this value
        int num3 = 15; // You can change this value
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
    }
}
