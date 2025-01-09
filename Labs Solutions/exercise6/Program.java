package exercise6;

import java.util.Iterator;

public class Program {

	public static void main(String[] args) {
		part1();
		part2();
		part3();
	}

	private static void part3() {
		// use the code in the exercise
		
	}

	private static void part2() {
		for (int i = 0; i < 100; i++) {
			try {
				RegistrationPlateFactory.getNextRegistrationPlate();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				break;
			}
		}
		
	}

	private static void part1() {
		Account acc = new Account(100, "Bob", 1000);
		acc.withdraw(900);
		System.out.println(acc.getDetails());
		
		try {
			
			acc.withdraw(500);
			
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
		finally {
			acc.close();
		}
		
	}

}
