/**
 * A class for the animal Lizard, which is carnivorous
 */
public class Lizard extends Animal implements Carnivore {
	private String name;

	public Lizard(String name) {
		super(name);
		this.name = name;
	}

	/**
 	 * We'll assume this Lizard is small and non venomous 
	 */
	public void hunt() {
		System.out.println(name + " lies in wait before darting out to consume a small spider");
	}

	/**
	 * This lizard hisses when threatened
	 */
	public void makeSound() {
		System.out.println(name + " hisses loudly");
	}

}