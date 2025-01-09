package exercise10;

public class Penguin extends Bird implements Swimmable{

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void makeNest() {
		System.out.println("Making a nest like a Penguin!");
	}
	
	@Override
	public void swim() {
		System.out.println("Swiming like a Penguin!");
		
	}

	@Override
	public void move() {
		System.out.println("Moveing like a Penguin!");
	}


}
