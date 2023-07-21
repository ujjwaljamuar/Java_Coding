package OOPS.Interfaces;

interface Animal {
	int eye = 2; // all fields are public static final by default

	void walk(); // public and abstract by default
}

interface Herbivore {

}

class Horse implements Animal, Herbivore {
	public void walk() {
		System.out.println("Horse walks on 4 legs and is herbivore.");
	}
}

public class Interfaces {
	public static void main(String[] args) {
		Horse horse = new Horse();
		horse.walk();
	}
}
