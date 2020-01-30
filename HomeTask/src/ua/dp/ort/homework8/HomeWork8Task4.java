package ua.dp.ort.homework8;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork8Task4 {

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
		int max = userNumbers[0];
        int imax = 0;
        int min = userNumbers[0];
        int imin = 0;
        for (int counter = 1; counter < userNumbers.length; counter++) {
            if (userNumbers[counter] > max) {
                max = userNumbers[counter];
                imax = counter;
            }
            if (userNumbers[counter] < min) {
                min = userNumbers[counter];
                imin = counter;
            }
        }
        userNumbers[imin] = max;
        userNumbers[imax] = min;
        for (int counter = 0; counter < userNumbers.length; counter++) {
            System.out.println("i = " + counter + " userNumbers[" + counter + "]=" + userNumbers[counter]);
        }
    }
}