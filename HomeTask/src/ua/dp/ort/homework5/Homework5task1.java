package ua.dp.ort.homework5;

import java.util.Scanner;

public class Homework5task1 {

	public static void main(String[] args) {
		// task1

		Scanner scanner = new Scanner(System.in);

		String userInput;
		System.out.println("Input rectangle side length ->");
		userInput = scanner.nextLine();
		double length = Double.parseDouble(userInput);

		System.out.println("Input rectangle side width ->");
		userInput = scanner.nextLine();
		double width = Double.parseDouble(userInput);

		String resultComputation = "Rectangle area is ";

		System.out.println(resultComputation + (length * width));
		scanner.close();
	}

}
