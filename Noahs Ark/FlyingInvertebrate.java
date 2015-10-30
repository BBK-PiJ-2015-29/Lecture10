/**
 * A superclass to hold all FlyingInvertebrates
 */ 
public class FlyingInvertebrate extends Animal{
	private String name;
	
	public FlyingInvertebrate(String name) {
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
	
	/**
	 * Most flying invertebrates will produce the same sound 'buzz' although there
	 * are some which won't e.g. Butterflies
	 */
	@Override
	public void makeSound() {
	 	System.out.println("BZZZZZZZZZZZZZZZZZZZZZ");
	}
}