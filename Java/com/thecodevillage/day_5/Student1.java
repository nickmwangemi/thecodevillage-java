import java.util.Scanner;

public class Student1 {
	public static void main(String[] args) {
		String name = "";
		String regNo = "";
		int mathsScore = 0;
		int engScore = 0;
		int kisScore = 0;
		int sciScore = 0;
		int total = 0;
		int meanScore = 0;

		Scanner scanner = new Scanner(System.in);

		print("Enter your name: ");
		name = scanner.nextLine();

		print("Enter your regNo: ");
		regNo = scanner.nextLine();

		print("Enter marks for MATH: ");
		mathsScore = scanner.nextInt();

		print("Enter marks for ENG: ");
		engScore = scanner.nextInt();

		print("Enter marks for KIS: ");
		kisScore = scanner.nextInt();

		print("Enter marks for SCI: ");
		sciScore = scanner.nextInt();

		scanner.close();
		// Output
		// Student details
		print("****REPORT CARD****");
		print("\nName: " + name);
		print("Reg No: " + regNo);
		print("\n");

		// Subject, score and grade
		print("MAT: " + mathsScore + " " + getGrade(mathsScore));
		print("ENG: " + engScore + " " + getGrade(engScore));
		print("KIS: " + kisScore + " " + getGrade(kisScore));
		print("SCI: " + sciScore + " " + getGrade(sciScore));

		// total marks
		total = mathsScore + engScore + kisScore + sciScore;

		print("\nTOTAL MARKS: " + total);

		// mean score
		meanScore = total / 4;
		print("\nMEAN SCORE: " + meanScore);

		// mean grade
		print("MEAN GRADE: " + getGrade(meanScore));

	}

	static String getGrade(int marks) {
		String grade = "";

		if (marks >= 80 && marks <= 100) {
			grade = "A";

		} else if (marks >= 60 && marks < 80) {
			grade = "B";

		} else if (marks >= 40 && marks < 60) {
			grade = "C";

		} else if (marks >= 0 && marks < 40) {
			grade = "D";
		} else {
			grade = "F";
		}

		return grade;
	}

	static void print(String message) {
		System.out.println(message);
	}

}