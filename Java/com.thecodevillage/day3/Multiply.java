public class Multiply {
	public static void main(String[] args) {
		int a = 20;
		int b = 40;

		int result = a * b;

		System.out.println("The result is: " + result);

		System.out.println("The result is: " + doSum(a, b));
		System.out.println("The result is: " + doSum(200, 100));
		System.out.println("The result is: " + doSubtract(200, 100));

	}

	static int doSum(int a, int b) {
		return a + b;
	}

	static int doSubtract(int a, int b) {
		return a - b;
	}
}
