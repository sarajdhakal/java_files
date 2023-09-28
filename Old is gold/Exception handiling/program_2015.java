
import java.util.Scanner;

public class program_2015 {
    public static void Test() throws ArithmeticException {
        int ag;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the age");
        ag = input.nextInt();
        if (ag < 18) {
            throw new ArithmeticException("You are underage");
        } else {
            System.out.println("YOu are elligible for voting.");
        }
    }

    public static void main(String args[]) {
        Test();
    }
}
