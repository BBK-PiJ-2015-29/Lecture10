/**
 * A class for the Bird: Eagle, a carnivore
 */

public class Eagle extends Bird implements Carnivore {
	private String name;

	public Eagle(String name) {
		super(name);
		this.name = name;
	}

	/**
	 * Eagles hunt many types of prey, some as large as 
	 * domestic mammals like sheep
	 */
	public void hunt() {
		System.out.println(name + " has flown off looking for a tasty meal far below");
	}

	/**
	 * The noise an Eagle makes
	 */
	public void makeSound() {
		System.out.println("Skreeeiiiiiiiiii!");
	}

	
}