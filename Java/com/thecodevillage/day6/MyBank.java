import java.util.Scanner;

public class MyBank {
	public static void main(String[] args) {

		int pin = 1234;
		int balance = 0;
		int choice = 0;

		Scanner scanner = new Scanner(System.in);

		print("\n***Welcome to Akiba Bank***");
		print("Enter your PIN: ");
		int entry = scanner.nextInt();

		while (entry != pin) {
			print("\nINCORRECT PIN. TRY AGAIN");
			print("Enter your PIN: ");
			entry = scanner.nextInt();
		}
		print("\n PIN Correct. You may proceed with account operations");

		// menu options
		print("\n***MENU***");
		print("1. Check Balance");
		print("2. Deposit");
		print("3. Withdraw");
		print("4. Send Money");
		print("0. Exit");

		print("Please enter your choice");

		choice = scanner.nextInt();

		if (choice == 1) {
			print("Your account balance is: " + balance);

		} else if (choice == 2) {
			print("Please enter deposit amount: ");
			int deposit = scanner.nextInt();
			balance = balance + deposit;
			print("\nYou have deposited " + deposit);
			print("Your new balance is " + balance);

		} else if (choice == 3) {
			print("Please enter withdrawal amount: ");
			int withdrawal = scanner.nextInt();

			if (withdrawal > balance) {
				print("You have insufficient funds to withdraw " + withdrawal);
			}

		} else if (choice == 4) {

		} else if (choice == 0) {

		} else {
			print("Invalid choice!");
		}

	}

	static void print(String message) {
		System.out.println(message);
	}

}