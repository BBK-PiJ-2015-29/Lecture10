/**
 * A class representing the Shark
 */
public class Shark extends AquaticNonMammal implements Carnivore{
	private String name;
	
	public Shark(String name) {
		super(name);
		this.name = name;
	} 
	
	/**
	 * Sharks usually hunt individually, but can collect in large groups to hunt 
	 * schools of fish or seals
	 */
	 
	public void hunt() {
	 	System.out.println(name + "has gone hunting for tasty seals");
	}
	 
	/**
     * Sharks don't make a sound, so instead:
     */
	public void makeSound() {
		System.out.println("Duuur Nuh! Duuur Nuh! DuurNuh DuurNuh!");
	}  
	
}