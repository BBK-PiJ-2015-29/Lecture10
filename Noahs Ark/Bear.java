/**
 * A class for the mammal Bear, an land Carnivore
 */
 
public class Bear extends Mammal implements Carnivore {
	private String name;
	
	public Bear(String name) {
		super(name);
		this.name = name;
	}
	
	/**
	 * Unlike some mammals, Bears usually give birth to more than one cub
	 */
	@Override
 	public void reproduce() {
 		boolean reproduction = giveBirth();
 		
 		if (reproduction) {
 			int number = (int) (Math.random() * 4);
 			String s = " cub";
 			String pl = " cubs";
 			if (number == 1) {
 				System.out.println(name + " has given birth to " + number + s);
 			}
 			else if (number == 0) {
 				
 			}
 			else {
 				System.out.println(name + " has given birth to " + number + pl);
 			}
 			
 		}
  	}
  	
  	/**
  	 * I don't know what sound a bear makes, but i think it is some kind of growl or roar
  	 */
  	public void makeSound() {
  	 	System.out.println("Roooooaaaarrr!");
  	}
  	 
  	/**
	 * All carnivores must hunt and kill to eat.
	 */

	public void hunt() {
		System.out.println(name + " goes looking for deer left unattended");
	}
}