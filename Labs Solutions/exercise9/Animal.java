package exercise9;

public abstract class Animal {
	AnimalType animalType;
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
