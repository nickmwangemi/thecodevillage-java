import java.util.Scanner;

public class Student {
	public static void main() {
		String name = "";
		int age;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your name: ");
		name = scanner.nextLine();

		System.out.println("Enter your age: ");
		age = scanner.nextInt();

		System.out.println("\n Name: " + name);
		System.out.println("\n Age: " + age);

	}
}