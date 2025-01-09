package exercise3;

import java.util.ArrayList;
import java.util.Random;

public class Program {

	public static void main(String[] args) throws Exception {
		part1();
		part2();
	}

	private static void part1() throws Exception {
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(new Vehicle(1, 10));
		vehicles.add(new Vehicle(2, 5));
		vehicles.add(new Vehicle(3, 8));

		boolean theEnd = false;
		do {
			for (Vehicle vehicle : vehicles) {
				Random rand = new Random();
				int n = rand.nextInt(50) + 1;

				vehicle.accelerate(n);
				if (vehicle.getDistanceTravelled() > 1000) {
					theEnd = true;
					break;
				}
			}
		} while (!theEnd);

		for (Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getDetails());
		}
	}

	private static void part2() {
		Ball.setWorld(300, 400);
		new Game();

	}

}
