public class EvenNumbers {

	public static void main(String[] args) {

		System.out.println("-- FOR LOOP --");
		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

		System.out.println("-- WHILE LOOP --");
		int index = 1;
		while (index <= 100) {
			if (index % 2 == 0) {
				System.out.println("Num: " + index);
			}
			index++;
		}

		System.out.println("-- DO WHILE LOOP --");
		int counter = 1;
		do {
			if (counter % 2 == 0) {
				System.out.println("Num: " + counter);
			}
			counter++;
		} while (counter <= 100);

	}
}
