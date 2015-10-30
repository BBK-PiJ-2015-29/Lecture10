/**
 * The parent abstract class for all Aquatic animals which
 * are not mammals
 */
public abstract class AquaticNonMammal extends Animal {
	private String name;
	
	public AquaticNonMammal(String name) {
		super(name);
		this.name = name;
	}
	/**
	 * Aquatic animals won't come when called.
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
