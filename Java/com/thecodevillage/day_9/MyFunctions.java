import java.text.DecimalFormat;
import java.util.Scanner;

public class MyFunctions {
	static final double PI = 3.142;

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
		double radius = 0;
		DecimalFormat dFormat = new DecimalFormat("#.##");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius: ");
		radius = scanner.nextDouble();

		System.out.println("Circumference: " + dFormat.format(circumference(radius)));
		System.out.println("Area: " + dFormat.format(area(radius)));
		System.out.println("Product: "+product(a, b));
		System.out.println();

		scanner.close();

	}

	static double area(double radius) {
		return PI * radius * radius;
	}

	static double circumference(double radius) {
		return 2 * PI * radius;
    }
    
    static int product(int a, int b) {
		return a*b;
	}
	
	static String getGrade(int mean) {
		String grade = "";
		if (mean >= 0 && mean <= 40)
			grade = "D";
		else if (mean > 40 && mean <= 60)
			grade = "C";
		else if (mean > 60 && mean <= 80)
			grade = "B";
		else if (mean > 80 && mean <= 100) {
			grade = "A";
		} else
			grade = "F";
		return grade;
	}
    
}