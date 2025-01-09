package exercise9;

public class Program {

	public static void main(String[] args) {
		Animal[] animals = {new Duck("Donald"), new Penguin("Happy feet"), new Fish("Mino")};
		for(Animal animal : animals) {
			System.out.println(animal.getName());
			if(animal instanceof Bird)
			{
				((Bird)animal).makeNest();
			}
		}

	}

}
