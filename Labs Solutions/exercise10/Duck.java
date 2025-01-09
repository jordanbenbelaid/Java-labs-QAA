package exercise10;

public class Duck extends Bird implements Flyable, Swimmable{

	public Duck(String name) {
		super(name);
	}

	@Override
	public void makeNest() {
		System.out.println("Making a nest like a Duck!");
		
	}

	@Override
	public void move() {
		System.out.println("Moveing like a Duck!");
		
	}

	@Override
	public void swim() {
		System.out.println("Diving under water like a Duck!");
		
	}

	@Override
	public void fly() {
		System.out.println("Flying like a Duck!");

		
	}

}
