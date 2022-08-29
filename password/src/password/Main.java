package password;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int attempts = 3;

		user user1 = new user("admin", "admin123");

		Scanner nameScanner = new Scanner(System.in);
		Scanner passwordScanner = new Scanner(System.in);

		System.out.println("Welcome to the login screen!");
		
		do {
			
			System.out.println("Enter username");
			String nameInput = nameScanner.nextLine();
			System.out.println("Enter password");
			String passwordInput = passwordScanner.nextLine();

			if (nameInput.equals(user1.getUsername()) && passwordInput.equals(user1.getPassword())) {

				System.out.println("Correct!");
				break;
			}

			else {
				System.out.println("----------------------------------------");
				System.out.println("Wrong, try again!");
				attempts--;
				System.out.println(attempts + " " + "attempts left");
				System.out.println("----------------------------------------");
			}
			if (attempts == 0) {
				System.out.println("----------------------------------------");
				System.out.println("No more attempts left");
				System.out.println("Closing application.");
				System.out.println("----------------------------------------");
				break;
			}
		} while (attempts != 0);

		nameScanner.close();
		passwordScanner.close();
	}
}
