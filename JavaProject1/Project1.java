import java.util.Scanner;

public class Project1 {
    public static void main(String []Args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("The result of multiplication is: " + multiply(a, b));
        }

        public static int multiply(int a, int b) {
            System.out.println(a + " * " + b);
            return a * b;
        }
    }