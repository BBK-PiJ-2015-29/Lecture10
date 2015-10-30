/**
 * A class for the Bird: Pidgeon
 */

public class Pidgeon extends Bird {
	private String name;

	public Pidgeon(String name) {
		super(name);
		this.name = name;
	}

	
	/**
	 * The noise a Pidgeon makes
	 */
	public void makeSound() {
		System.out.println("Coooo cooo");
	}

	
}