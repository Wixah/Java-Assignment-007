/**
 * @author Trevor Hartman
 * @author Rachelle Iloff
 * created 3/12/2023
 * @since version 1.0
 */
import java.util.Scanner;
public class MyMath {
    static Scanner newScanner = new Scanner(System.in);
    public static int gcf(int a, int b) {
        int c;
        while (b!=0) {
            if(a>b) {
                c = b;
                b = a % b;
                a = c;
            }else {
                b = b % a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("You can enter two integer values to calculate the GCF below.");
        int a, b, c;
        System.out.print("Enter a number here please: ");
        a = Integer.parseInt(newScanner.nextLine());
        System.out.print("Enter a second number here please: ");
        b = Integer.parseInt(newScanner.nextLine());
        c = gcf(a,b);
        System.out.printf("The GCF of %s and %s is %s%n",a,b,c);
    }
}