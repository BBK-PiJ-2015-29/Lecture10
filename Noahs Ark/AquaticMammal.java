
/**
 * A parent class for all Aquatic mammals, making necessary changes 
 * for the reproduction method.
 */
 public abstract class AquaticMammal extends Mammal {
 	private String name;
 	
 	public AquaticMammal(String name) {
 		super(name);
 		this.name = name;
 	}
 	
 	/**
	 *  Aquatic animals will not come when called.
	 */
	 @Override
	public void call() {
		System.out.println(name + " will not come");
	}
	
	/**
	 *  Aquatic animals all swim.
	 */
	public void swim() {
		System.out.println(name + " is now swimming around");
	}
 }	