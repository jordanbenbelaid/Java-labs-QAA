package exercise1;

import java.util.Scanner;

public class Utils {
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
