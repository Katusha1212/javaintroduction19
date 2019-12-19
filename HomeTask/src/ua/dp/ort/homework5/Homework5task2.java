package ua.dp.ort.homework5;

import java.util.Scanner;

public class Homework5task2 {

	public static void main(String[] args) {
		// task2

		Scanner scanner = new Scanner(System.in);

	    String userInput;

	    System.out.println("Input first number  ->");
	    userInput = scanner.nextLine();
	    double firstNumber = Double.parseDouble(userInput);
	    System.out.println("Your first number  is " + userInput);

	    System.out.println("Input your second number ->");
	    userInput = scanner.nextLine();
	    double secondNumber = Double.parseDouble(userInput);
	    System.out.println("Your second number is  " + userInput);

	    if (firstNumber == secondNumber) {
	   System.out.println("Numbers are equal");
	    } else {
	        System.out.println("Numbers are different");
	      }
	  
	      if (firstNumber > secondNumber) {
	        System.out.println("First number a is greater than second number b");
	      }
	      if (firstNumber < secondNumber){
	      System.out.println("First number a are less than second number b");
	    }
	  
	      if (firstNumber >= secondNumber) {
	        System.out.println("First number a is equal or greater second number b");
	      } 
	      if (firstNumber <= secondNumber){
	    System.out.println("First number a are equal or less second number b");
	    }
	}}