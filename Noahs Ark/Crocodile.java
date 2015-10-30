/**
 * A class for the aquatic animal Crocodile, which is carnivorous
 */
public class Crocodile extends AquaticNonMammal implements Carnivore {
	private String name;

	public Crocodile(String name) {
		super(name);
		this.name = name;
	}

	/**
 	 * We'll assume this is an African crocodile which mainly hunts
 	 * large prey
	 */
	public void hunt() {
		System.out.println(name + " disappears under the water, lying in wait");
	}

	/**
	 * This crocodile makes crying noises to attract passing good samaritans
	 */
	public void makeSound() {
		System.out.println(name + " starts weeping");
	}

}