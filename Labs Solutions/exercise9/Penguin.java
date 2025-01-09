package exercise9;

public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void makeNest() {
		System.out.println("Making a nest like a Penguin!");
	}

}
