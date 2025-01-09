package exercise5;

import java.util.HashMap;

public class Zoo {
	HashMap<String, Integer> animals = new HashMap<String, Integer>();
	String[] originalAnimals = {"Zebra", "Lion", "Buffalo"};
	String[] newAnimals = {"Zebra", "Gazelle", "Buffalo", "Zebra"};
	
	
	public void open(){
		for(String name : originalAnimals) {
			addAnimal(name);
		}
		for(String name : newAnimals) {
			addAnimal(name);
		}
	}
	
	private void addAnimal(String name) {
		int count = 1;
		if(animals.containsKey(name)) {
			count = animals.get(name) + 1;
		}
		animals.put(name, count);
	}

	public String showDetails() {
		for(String name : animals.keySet()) {
			System.out.println(animals.get(name) + ", " + name);
		}

		return "";
	}

}
