package exercise1;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Lab01
		System.out.println("Hello, World!");
		// Lab02
		int age = Utils.getInt("What is your age?");
		String name = Utils.getString("What is your name?");
		System.out.println("Hello " + name + " next year you will be " + (age + 1));

		// Lab02 moving methods to a separate class
		age = Utils.getInt("What is your age?");
		name = Utils.getString("What is your name?");
		System.out.println("Hello " + name + " next year you will be " + (age + 1));

		// Lab03 - Life insurance calculator
		LifeInsurance life = new LifeInsurance();
		int count = 3;
		while (count > 0) {
			System.out.println(life.calculate());
			if (Utils.getString("Do you want to get another life insurance quote (y/n)?").equals("n")) {
				break;
			}
		}
	}

	// These 2 methods will move to a separate class in Lab02
	public static int getInt(String prompt) {
		System.out.print(prompt + " ");
		Scanner s = new Scanner(System.in);
		return s.nextInt();
	}

	public static String getString(String prompt) {
		System.out.print(prompt + " ");
		Scanner s = new Scanner(System.in);
		return s.nextLine();
	}

}
