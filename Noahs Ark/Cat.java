/**
 * A class for the mammal Cat, a domestic animal
 */
 
public class Cat extends Mammal implements Domestic {
	private String name;
	
	public Cat(String name) {
		super(name);
		this.name = name;
	}
	
	/**
	 * Unlike some mammals, Cats usually give birth to more than one cub
	 */
	@Override
 	public void reproduce() {
 		boolean reproduction = giveBirth();
 		
 		if (reproduction) {
 			int number = (int) (Math.random() * 6);
 			String s = " kitten";
 			String pl = " kittens";
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
  	 * What sound do cats make?
  	 */
  	 public void makeSound() {
  	 	System.out.println("Meow!");
  	 }
  	 
  	 /**
  	 * A method by which the cat will request food from humans
  	 */ 
  	public void botherHumanForFood() {
  		System.out.println(name + " purrs loudly and wraps itself around your legs");
  	}
}