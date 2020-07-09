import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
	static final double PI = 3.142;

	public static void main(String[] args) {
		double radius = 0;
		DecimalFormat dFormat = new DecimalFormat("#.##");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius: ");
		radius = scanner.nextDouble();

		System.out.println("Circumference: " + dFormat.format(circumference(radius)));
		System.out.println("Area: " + dFormat.format(area(radius)));

		scanner.close();

	}

	public static double area(double radius) {
		return PI * radius * radius;
	}

	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
}
