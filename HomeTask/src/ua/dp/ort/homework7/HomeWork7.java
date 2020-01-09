package ua.dp.ort.homework7;

import java.util.Scanner;

public class HomeWork7 {

	public static final int MIN_NUMBERS_OF_LITRES_AT_GAS_STATION = 2_000;
	public static final int NUMBERS_OF_MILLILITERS_IN_ONE_LITER = 1_000;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput;
		double litersOfTank = 0;
		double millilitersOfPump = 0;
		double numberOfLitersForClient = 0;

		while (true) {
			System.out.println("Input litters of tank ->");
			userInput = scanner.nextLine();
			double unchekedLitersOfTank = Double.parseDouble(userInput);
			if (unchekedLitersOfTank < MIN_NUMBERS_OF_LITRES_AT_GAS_STATION) {
				System.out.println("Your input is not corect");
				continue;
			} else {
				litersOfTank = unchekedLitersOfTank;
				break;
			}
		}

		while (true) {
			System.out.println("Input milliliters of pump ->");
			userInput = scanner.nextLine();
			double unchekedMillilitersOfPump = Double.parseDouble(userInput);
			if (unchekedMillilitersOfPump <= 0) {
				System.out.println("Your input is not corect");
				continue;
			} else {
				millilitersOfPump = unchekedMillilitersOfPump;
				break;
			}
		}

		while (true) {
			System.out.println("Input number of liters for client ->");
			userInput = scanner.nextLine();
			double unchekedNumberOfLitersForClient = Double.parseDouble(userInput);
			if (unchekedNumberOfLitersForClient <= 0) {
				System.out.println("Your input is not corect ->");
				continue;
			} else {
				numberOfLitersForClient = unchekedNumberOfLitersForClient;
				break;
			}
		}

		while (true) {
			System.out.println(
					"Remaining fuel at a gas station is " + (litersOfTank - numberOfLitersForClient) + " liters ");
			System.out.println("The number of pump-up portions is "
					+ (numberOfLitersForClient * NUMBERS_OF_MILLILITERS_IN_ONE_LITER) / millilitersOfPump);
			break;
		}

	}
}