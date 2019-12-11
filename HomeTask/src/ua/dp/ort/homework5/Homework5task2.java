package ua.dp.ort.homework5;

import java.util.Scanner;

public class Homework5task2 {

	public static void main(String[] args) {
		/*
		 * Ќаписать программу - анализатор чисел. ѕрограмма должна позвол€ть
		 * пользователю вводить два числа. » выводить в консоль информацию в случае,
		 * если: - число а равно числу б? - число а не равно числу б? - число а больше
		 * б? - число а больше или равно б? - число а меньше б? - число а меньше или
		 * равно б?
		 */

		Scanner scanner = new Scanner(System.in);

		String userInput;

		System.out.println("Input first number a ->");
		userInput = scanner.nextLine();
		double a = Double.parseDouble(userInput);
		System.out.println("Your first number a is " + userInput);

		System.out.println("Input your second number b ->");
		userInput = scanner.nextLine();
		double b = Double.parseDouble(userInput);
		System.out.println("Your second number is  " + userInput);

		System.out.println("a == b = " + (a == b));
		System.out.println("a != b = " + (a != b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a >= b = " + (a >= b));
		System.out.println("a < b = " + (a < b));
		System.out.println("a <= b = " + (a <= b));

		scanner.close();
	}

}
