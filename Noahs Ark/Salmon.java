/**
 * A class representing Salmon
 */
public class Salmon extends AquaticNonMammal {
	private String name;
	
	public Salmon(String name) {
		super(name);
		this.name = name;
	}
	
	/**
	 * For the sake of this class, we'll model the Salmon's sound on the goldfish
	 */
	 
	public void makeSound() {
		System.out.println("Bloop Bloop");
	}
}