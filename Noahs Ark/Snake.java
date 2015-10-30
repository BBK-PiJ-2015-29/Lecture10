/**
 * A class for the animal Snake, which is carnivorous
 */
public class Snake extends Animal implements Carnivore {
	private String name;

	public Snake(String name) {
		super(name);
		this.name = name;
	}

	/**
 	 * We'll assume this Snake is venomous not a constrictor 
	 */
	public void hunt() {
		System.out.println(name + " bites a passing rat and waits for it to die slowly");
	}

	/**
	 * This Snake hisses when threatened
	 */
	public void makeSound() {
		System.out.println(name + " hisses loudly");
	}

}