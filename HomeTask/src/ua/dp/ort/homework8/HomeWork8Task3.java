package ua.dp.ort.homework8;

import java.util.Scanner;

public class HomeWork8Task3 {

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
		int min = userNumbers[0];
		int max = userNumbers[0];
		int counter = 0;

		for (counter = 1; counter < userNumbers.length; counter++) {
			if (min > userNumbers[counter]) {
				min = userNumbers[counter];
			}
		}

		for (counter = 1; counter < userNumbers.length; counter++) {
			if (max < userNumbers[counter]) {
				max = userNumbers[counter];
			}
		}
		System.out.println("Минимальный элемент " + min);
		System.out.println("Максимальный элемент " + max);

	}

}
