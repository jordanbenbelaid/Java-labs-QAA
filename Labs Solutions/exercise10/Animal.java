package exercise10;

public abstract class Animal implements Moveable{
	AnimalType animalType;
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void Move() {
		System.out.println("Animal moving!");
	}
}
