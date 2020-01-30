package ua.dp.ort.homework8;

import java.util.Scanner;

public class HomeWork8Task2 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] userNumbers = new int[20];

		for (int counter = 0; counter < 20; counter++) {
			System.out.print("Please input " + (counter + 1) + " number  ");

			String userInput = scanner.nextLine();
			int userNumber = Integer.parseInt(userInput);

			userNumbers[counter] = userNumber;
		}
		scanner.close();

		int pozitiveCount = 0;
		double sum = 0;
		double rezult = 0;

		for (int counter = 0; counter < userNumbers.length; counter++) {
			if (userNumbers[counter] > 0) {
				sum = sum + userNumbers[counter];
				pozitiveCount++;

			}

		}

		rezult = sum / pozitiveCount;
		System.out.println("Arithmetic mean of positive elements " + rezult);

	}
}