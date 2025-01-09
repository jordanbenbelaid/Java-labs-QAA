package exercise10;

public class Fish  extends Animal implements Swimmable{

	public Fish(String name) {
		super(name);
		animalType = AnimalType.Fish;
	}

	@Override
	public void move() {
		System.out.println("Moving like a fish!");
		
	}

	@Override
	public void swim() {
		System.out.println("Swiming like a fish!");
		
	}

}
