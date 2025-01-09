package exercise9;

public class Duck extends Bird{

	public Duck(String name) {
		super(name);
	}

	@Override
	public void makeNest() {
		System.out.println("Making a nest like a Duck!");
		
	}

}
