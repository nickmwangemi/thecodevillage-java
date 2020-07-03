public class Student {
	public static void main(String[] args) {
		String name = "Nick";
		String admissionNo = "ABCD1234";
		String studentClass = "4 North";
		String course = "Java";
		String gender = "Male";
		String address = "Nairobi";
		String sport = "Rugby";
		String grade = "A";
		int totalMarks = 400;
		String room = "36";
		boolean activityFeePaid = false;
		double feeBalance = 1000;

		System.out.println(
				"\nName: " + name + "\nAdmission No: " + admissionNo + "\nClass: " + studentClass + "\nCourse: "
						+ course + "\nGender: " + gender + "\nAddress: " + address + "\nSport: " + sport + "\nGrade: "
						+ grade + "\nTotal Marks: " + totalMarks + "\nRoom: " + room + "\nFee Balance: " + feeBalance);

		// Conditions
		if (activityFeePaid) {
			System.out.println("Activity Fee Paid: " + "YES");
		} else {
			System.out.println("Activity Fee Paid: " + "No");
		}

		if (feeBalance >= 10000 && feeBalance <= 15000) {
			System.out.println("STATUS: CANNOT ACCESS THE LIBRARY");
		}

		if (feeBalance > 15000) {
			System.out.println("STATUS: GO HOME ASAP");
		}

		if (feeBalance < 15000) {
			System.out.println("STATUS: REMAIN IN SCHOOL");
		}

	}

}