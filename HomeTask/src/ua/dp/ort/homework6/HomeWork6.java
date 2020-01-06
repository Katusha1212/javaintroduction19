package ua.dp.ort.homework6;

import java.util.Scanner;

public class HomeWork6 {

	public static final int COFFEE = 1;
	public static final int SODA = 2;
	public static final int COCA_COLA = 3;
	public static final int PEPSI_COLA = 4;
	public static final int EXIT = 0;

	public static final int COST_COFFEE = 5;
	public static final int COST_SODA = 3;
	public static final int COST_COCA_COLA = 10;
	public static final int COST_PEPSI_COLA = 10;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String userInput;

		System.out.println("Products  to choose ");
		System.out.println(" 1.Coffe cost " + COST_COFFEE);
		System.out.println(" 2.Soda cost " + COST_SODA);
		System.out.println(" 3.Coca-Cola cost " + COST_COCA_COLA);
		System.out.println(" 4.Pepsi-Cola cost " + COST_PEPSI_COLA);
		System.out.println(" 0.Exit from program!");

		System.out.println("Input your money >");
		userInput = scanner.nextLine();
		int moneyUser = Integer.parseInt(userInput);

		if (moneyUser >= COST_COCA_COLA && moneyUser >= COST_PEPSI_COLA) {
			System.out.println("Input product: coda, coffee, cola or pepsi");
			System.out.println("For coffee input 1");
			System.out.println("For coda input 2");
			System.out.println("For cola input 3");
			System.out.println("For pepsi input 4");
			System.out.println("For exit input 0");
			userInput = scanner.nextLine();

			int restOfMoneyUser = Integer.parseInt(userInput);
			int productType = Integer.parseInt(userInput);

			if (productType == COFFEE) {
				restOfMoneyUser = (int) (moneyUser - COST_COFFEE);
				System.out.println("Your product is coffee, it cost 5. The rest of money is " + restOfMoneyUser);

			}
			if (productType == SODA) {
				restOfMoneyUser = (int) (moneyUser - COST_SODA);
				System.out.println("Your choice soda , it cost 3. The rest of money is " + restOfMoneyUser);
			}
			if (productType == COCA_COLA) {
				restOfMoneyUser = (int) (moneyUser - COST_COCA_COLA);
				System.out.println("Your choice Coca-Cola , it cost 10. The rest of money is " + restOfMoneyUser);
			}
			if (productType == PEPSI_COLA) {
				restOfMoneyUser = (int) (moneyUser - COST_PEPSI_COLA);
				System.out.println("Your choice Pepsi-Cola , it cost 10. The rest of money is " + restOfMoneyUser);
			}
			if (productType == EXIT) {
				System.out.println("Exit from program!");
			}
		}

		if (moneyUser < COST_COCA_COLA && moneyUser >= COST_COFFEE) {
			System.out.println("Input product: coda, coffee");
			System.out.println("For coffee input 1");
			System.out.println("For coda input 2");
			System.out.println("For exit input 0");
			userInput = scanner.nextLine();

			int restOfMoneyUser = Integer.parseInt(userInput);
			int productType = Integer.parseInt(userInput);

			if (productType == COFFEE) {
				restOfMoneyUser = (int) (moneyUser - COST_COFFEE);
				System.out.println("Your product is coffee, it cost 5. The rest of money is " + restOfMoneyUser);

			}
			if (productType == SODA) {
				restOfMoneyUser = (int) (moneyUser - COST_SODA);
				System.out.println("Your choice soda , it cost 3. The rest of money is " + restOfMoneyUser);
			}

			if (productType == EXIT) {
				System.out.println("Exit from program!");

			}
		}
		if (moneyUser < COST_COFFEE && moneyUser >= COST_SODA) {
			System.out.println("You can buy coda");
			System.out.println("For coda input 2");
			System.out.println("For exit input 0");
			userInput = scanner.nextLine();
			int restOfMoneyUser = Integer.parseInt(userInput);
			int productType = Integer.parseInt(userInput);
			if (productType == SODA) {
				restOfMoneyUser = (int) (moneyUser - COST_SODA);
				System.out.println("Your choice soda , it cost 3. The rest of money is " + restOfMoneyUser);
			}
			if (productType == EXIT) {
				System.out.println("Exit from program!");

			}
		}

		if (moneyUser < COST_SODA)

		{
			System.out.println("Sorry, you don’t have enough money.");
			System.out.println("Exit from program!");
			System.out.println("For exit input 0");
			userInput = scanner.nextLine();
		}
		scanner.close();
	}

}