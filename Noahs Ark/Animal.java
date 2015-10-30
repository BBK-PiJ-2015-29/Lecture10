/**
 * An interface for animal showing all common behaviours
 */
public abstract class Animal{
	private String name;
 	
 	/**
 	 * Constructor method will be the same for all animals,
 	 * giving the animal its name.
 	 * 
 	 * @param name the String holding the animal's name.
 	 */
	public Animal(String name) {
		super();
		this.name = name;
	}
 	 
 	/**
 	 * This method will be common to all animals,
 	 * all animals will be able to respond to being called.
 	 * Although some will respond differently.
 	 */
 	public void call() {
 		System.out.println(name + " is coming...");
 	}
 	
 	/**
 	 * All animals reproduce somehow, often but not always requiring 
 	 * interaction with other objects of the same animal, 
 	 * also in theory with other objects of different but similar animals.
 	 * By default will be set to the layEgg() method as an implementation
 	 * as the majority of animals do.
 	 */
 	public void reproduce() {
 		boolean reproduction = layEgg();
 		if (reproduction) {
 			System.out.println(name + " has laid an egg");
 		}
 		else {
 			System.out.println(name + " has not laid an egg");
 		}
 	}
 	
 	/**
 	 * This method allows most animals to reproduce, unless the don't lay eggs
 	 * in which case an alternative method will be called.
 	 * The method generates a random number and uses it to determine if the egg
 	 * laying attempt was successful or not.
 	 *
 	 * @return true for a successful lay, false otherwise.
 	 */
 	public boolean layEgg() {
 		int chance = (int) (Math.random() * 10);
 		
 		if (chance > 3) {
 			return true;
 		}
 		else {
 			return false;
 		}
 	}
 	
 	/**
 	 * An abstract method for all animals, each animal will make a different sound
 	 */
 	public abstract void makeSound();
 }