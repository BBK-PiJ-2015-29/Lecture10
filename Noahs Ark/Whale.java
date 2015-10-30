/**
 * A class for the mammal whale, an aquatic animal
 */
public class Whale extends AquaticMammal implements Carnivore{
	private String name;
	
	public Whale(String name) {
		super(name);
		this.name = name;
	}
	
	
	
	/**
	 * Humpback whales suspend themselves upside down in the water and sing for hours
	 * to attract mates and to communicate amongst each other.
	 */
	@Override
	public void makeSound(){
		System.out.println("BBBWOOOOOOOOOooo... OOOHHOOOAAWWOO");
	}
	
	/**
	 * We will assume these whales are balene whales not toothed whales 
	 */
	 
	 public void hunt(){
	 	System.out.println(name + " used its huge mouth to sieve krill from the water"); 
	 }
}
	 