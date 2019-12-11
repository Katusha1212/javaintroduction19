package ua.dp.ort.homework5;

import java.util.Scanner;

public class Homework5task3 {

	public static void main(String[] args) {
		// task3

		Scanner scanner = new Scanner(System.in);
		
		String userInput;
		
		System.out.println("Input first side length figure");
		userInput = scanner.nextLine();
		double firstSideLengthFigure = Double.parseDouble(userInput);
		System.out.println("First side length figure is " + userInput);
		
		System.out.println("Input second side length figure");
		userInput = scanner.nextLine();
	double secondSideLengthFigure = Double.parseDouble(userInput);
	System.out.println("Second side length figure is " + userInput);
	
	String userInfo = "Type of this figure is ";

	if(firstSideLengthFigure == secondSideLengthFigure) {
		userInfo = userInfo + "square";
	} else {
		userInfo = userInfo + "rectangle";
		
	}
	System.out.println(userInfo);
		
scanner.close();
	}

}
