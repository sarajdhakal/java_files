
import java.util.Scanner;

public class Hello {
    public static void main(String args[]) {
        int c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        c = input.nextInt();
        int a[] = new int[4];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        try {
            int d = 1 / 0;
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("Data not founnd");
        } finally {
            System.out.println("HEllo finally!");
        }
    }
}
