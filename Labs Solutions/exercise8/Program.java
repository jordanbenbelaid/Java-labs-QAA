package exercise8;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		part1();
		part2();
	}

	private static void part2() {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Bob","Tester"));
		employees.add(new Employee("Linda","Developer"));
		
		Manager manager = new Manager("Mike", "Trainer");
		manager.employees = employees;
		System.out.println(manager.getInfo());
	}

	private static void part1() {
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car("Ford"));
		cars.add(new RacingCar("Ferrari"));
		cars.add(new Car("BMW"));
		processCars(cars);
	}

	private static void processCars(ArrayList<Car> cars) {
		for(Car car : cars) {
			car.getToSixty();
			System.out.println(car.getDetails());
		}
		
	}

}
