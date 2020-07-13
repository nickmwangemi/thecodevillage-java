import java.util.Scanner;

public class Area1 {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int c = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the first number: ");
		a = scanner.nextInt();

		System.out.println("Enter the second number: ");
		b = scanner.nextInt();

		System.out.println("Enter the third number: ");
		c = scanner.nextInt();

		System.out.println("The product of " + a + " and " + b + " is " + product(a, b));

		System.out.println("The product of " + a + " and " + b + " and " + c + " is " + product(a, b, c));

		scanner.close();

	}

	static int product(int a, int b) {
		return a * b;
	}

	static int product(int a, int b, int c) {
		return a * b * c;
	}

}