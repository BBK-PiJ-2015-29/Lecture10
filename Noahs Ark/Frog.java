/**
 * A class for the aquatic animal Frog, which is carnivorous
 */
public class Frog extends AquaticNonMammal implements Carnivore  {
	private String name;

	public Frog(String name) {
		super(name);
		this.name = name;
	}

	/**
 	 * Frogs use their long sticky tongues to catch flying insects and other small
 	 * animals.
	 */
	public void hunt() {
		System.out.println(name + "'s tongue darts out, snaring a passing fly");
	}

	/**
	 * This frog is the same frog found in Hollywood California.
	 */
	public void makeSound() {
		System.out.println("Ribbit ribbit");
	}

}