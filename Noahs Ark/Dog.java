/**
 * A class for the mammal Dog, a domestic animal
 */
 
public class Dog extends Mammal implements Domestic {
	private String name;
	
	public Dog(String name) {
		super(name);
		this.name = name;
	}
	
	/**
	 * Unlike some mammals, Dogs usually give birth to more than one cub
	 */
	@Override
 	public void reproduce() {
 		boolean reproduction = giveBirth();
 		
 		if (reproduction) {
 			int number = (int) (Math.random() * 6);
 			String s = " puppy";
 			String pl = " puppies";
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
  	 * Must be an English dog
 	 */
  	public void makeSound() {
  	 	System.out.println("Wooof!");
  	}
  	
  	/**
  	 * A method by which the dog will request food from humans
  	 */ 
  	public void botherHumanForFood() {
  		System.out.println(name + " barks loudly while facing food bowl");
  	}
}