package ua.dp.ort.homework8;

import java.util.Scanner;

public class HomeWork8Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] userNumbers = new int[20];

		for (int counter = 0; counter < userNumbers.length; counter++) {
			System.out.print("Please input " + (counter + 1) + " number>  ");

			String userInput = scanner.nextLine();
			int userNumber = Integer.parseInt(userInput);

			userNumbers[counter] = userNumber;
		}
		scanner.close();

		int pozitiveCount = 0;
		double sum = 0;

		for (int counter = 0; counter < userNumbers.length; counter++) {
			if (userNumbers[counter] > 0 && userNumbers[counter] % 2 == 0) {
				sum += userNumbers[counter];
				pozitiveCount++;

			}

		}

		System.out.println("Sum of even positive elements " + sum);

	}
}