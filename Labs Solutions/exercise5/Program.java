package exercise5;

import java.util.ArrayDeque;

public class Program {
	static ArrayDeque<ShoppingBasket> baskets = new ArrayDeque<>();

	public static void main(String[] args) {
		part1();
		part2();
		part3();	
	}

	private static void part1() {
		Ball.setWorld(300, 400);
		new Game();
	}

	private static void part2() {
		buy();
		processBaskets();
		System.out.println(baskets.size());
	}

	private static void part3() {
		Zoo zoo = new Zoo();
		zoo.open();
		zoo.showDetails();
	}

	private static void processBaskets() {
		for (ShoppingBasket basket : baskets) {
			System.out.println(basket.getDetails());
			baskets.remove(basket);
		}

	}

	private static void buy() {
		baskets.add(new ShoppingBasket("Pen", 100, 10));
		baskets.add(new ShoppingBasket("Book", 50, 20));
		baskets.add(new ShoppingBasket("Watch", 10, 200));
	}

}
