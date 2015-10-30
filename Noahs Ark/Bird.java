/**
 * An abstract class for the group Bird, any flightless birds will have the call method
 * overridden
 */

 public abstract class Bird extends Animal {
 	private String name;

 	public Bird(String name) {
 		super(name);
 		this.name = name;
 	}

 	/**
	 * Flying animals will take a while to come when called
	 */
	@Override
	public void call() {
		System.out.println(name + " now flying, will come later when tired");
	}
 }