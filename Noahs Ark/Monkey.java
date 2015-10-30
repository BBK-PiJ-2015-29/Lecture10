/**
 * A class for the mammal Monkey
 */
 
public class Monkey extends Mammal {
	private String name;
	
	public Monkey(String name) {
		super(name);
		this.name = name;
	}
	
  	
  	/**
  	 * Monkey see monkey do
  	 */
  	public void makeSound() {
  	 	System.out.println("Oooh oohh aah ah ah ah!");
  	}
  	
}