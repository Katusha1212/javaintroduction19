package ua.dp.ort.homework7;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput;
		double litersOfTank = 0;
		double millilitersOfPump = 0;
		double numberOfLitersForClient = 0;

		while (true) {
			System.out.println("Input litters of tank ->");
			userInput = scanner.nextLine();
			litersOfTank = Double.parseDouble(userInput);

			if (litersOfTank < 1000) {
				System.out.println("Your input is not corect");
			}

			else {

				break;
			}
		}
		while (true) {
			System.out.println("Input milliliters of pump ->");
			userInput = scanner.nextLine();
			millilitersOfPump = Double.parseDouble(userInput);
			if (millilitersOfPump <= 0) {
				System.out.println("Your input is not corect");
			} else {
				break;
			}
		}

		while (true) {
			System.out.println("Input Number of liters for client ->");
			userInput = scanner.nextLine();
			numberOfLitersForClient = Double.parseDouble(userInput);

			if (numberOfLitersForClient <= 0) {
				System.out.println("Your input is not corect");
			} else {

				break;
			}
		}
		while (true) {
			System.out.println("Remaining fuel at a gas station is " + (litersOfTank - numberOfLitersForClient));
			System.out.println(
					"The number of pump-up portions is " + (numberOfLitersForClient * 1000) / millilitersOfPump);
			break;
		}
	}

}