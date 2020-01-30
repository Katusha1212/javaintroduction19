package ua.dp.ort.homework8;

import java.util.Arrays;
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

		Arrays.sort(userNumbers);

		System.out.println("First smallest element " + userNumbers[0]);
		System.out.println("Second smallest element " + userNumbers[1]);
	}

}
