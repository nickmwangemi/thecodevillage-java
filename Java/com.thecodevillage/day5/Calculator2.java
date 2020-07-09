import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");

        num1 = scanner.nextInt();

        System.out.println("Enter second number: ");

        num2 = scanner.nextInt();

        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;

        System.out.println("The sum is: " + sum);
        System.out.println("The difference is: " + subtract);
        System.out.println("The result of mulitplication is: " + multiply);
        System.out.println("The result of division is: " + division);
        System.out.println("The modulus is: " + modulus);

    }

}
