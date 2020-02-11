package ua.dp.ort.homework9;

import java.util.Scanner;

public class ExaminationTask {


		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			System.out.println("Input symbol for rectangle ");
			char symbolRectangle = UserInput.inputSymboleName(scanner);

			System.out.println("Input length for rectangle ");
			int lengthRectangle = UserInput.input(scanner);

			System.out.println("Input width for rectangle ");
			int widthRectangle = UserInput.input(scanner);

			char[][] rectangleArr = new char[lengthRectangle][widthRectangle];

			for (int i = 0; i < rectangleArr.length; i++) {
				for (int j = 0; j < rectangleArr[i].length; j++) {
					rectangleArr[i][j] = symbolRectangle;

					System.out.print(" " + rectangleArr[i][j]);
				}
				System.out.println();
			}
		}

	}