package com.ulco.calculatrice;

import java.util.Scanner;

public class Calculatrice {

	private boolean isRunning;
	private final Scanner in;

	public Calculatrice() {
		isRunning = false;
		in = new Scanner(System.in);
	}

	public void run() {
		isRunning = true;
		float val1, val2;
		String ope;
		while (isRunning) {
			System.out.print("Type :q to leave or enter to continue > ");
			final String input = in.nextLine();
			if (input.equals(":q")) {
				isRunning = false;
			}
			System.out.print("Value 1 : ");
			val1 = Float.parseFloat(in.nextLine());
			System.out.print("Operator : ");
			ope = in.nextLine();
			System.out.print("Value 2 : ");
			val2 = Float.parseFloat(in.nextLine());
			switch (ope) {
			case "+":
				System.out.println(val1 + val2);
				break;
			case "*":
				System.out.println(val1 * val2);
				break;
			case "-":
				System.out.println(val1 - val2);
				break;
			case "/":
				if (val2 == 0)
					System.out.println("Error div by 0");
				else
					System.out.println(val1 / val2);
				break;
			default:
				System.out.println("unsupported operator : " + ope);
				break;
			}
		}
	}
}
