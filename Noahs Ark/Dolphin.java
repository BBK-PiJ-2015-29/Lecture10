/**
 * A class for Dolphin which will extend the AquaticMammal class
 */
public class Dolphin extends AquaticMammal implements Carnivore {
	private String name;
	
	public Dolphin(String name) {
		super(name);
		this.name = name;
	}
	
	/**
	 * Dolphins use a series of clicks and whistles to communicate and to find prey
	 */
	 @Override
	 public void makeSound() {
	 	System.out.println("Click, click.... whistle");
	 }
	 
	/**
	 * This dolphin species only hunts fish
	 */
	 
	 public void hunt(){
	 	System.out.println(name + " went hunting for fish"); 
	 }
}