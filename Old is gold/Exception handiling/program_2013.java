import java.util.Scanner;

public class program_2013 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a, b;
        double c;
        System.out.println("Enter a number:");
        a = input.nextInt();
        System.out.println("Enter another number:");
        b = input.nextInt();
        try {
            System.out.println("IN try block");
            c = a / b;
            System.out.println("The answer after division is " + c);
        } catch (ArithmeticException e) {
            System.out.println("Exception detected");
        } finally {
            System.out.println("IN finally block");
        }
    }
}
