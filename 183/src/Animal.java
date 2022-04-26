
public abstract class Animal {
	
	String name, color;
	double weight;
	
	Animal() {
		
	}
	
	Animal(String name, String color) {
		this(name, color, 0.0);
	}
	
	Animal(String name, String color, double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
	}
	
	public void eat() {
		System.out.println(name + " eats.");
	}
	
	public abstract void makeSound();
}
