/**
 * A parent class for all mammals, making necessary changes 
 * for the reproduction method.
 */
 public abstract class Mammal extends Animal{
 	
 	private String name;
 	
 	/**
 	 * The constructor method will give the mammal its name.
 	 *
 	 * @param name is the name of the mammal.
 	 */
 	public Mammal(String name) {
 		super(name);
 		this.name = name;
 	}
 	
 	
 	/**
 	 * Mammals do not reproduce using eggs, so will giveBirth instead
 	 */
 	@Override
 	public void reproduce() {
 		boolean reproduction = giveBirth();
 		
 		if (reproduction) {
 			System.out.println(name + " has given birth");
 		}
  	}
 	
 	/**
 	 * determines the chance of a successful birth
 	 *
 	 * @return true if the birth is successful, false otherwise.
 	 */
 	public boolean giveBirth() {
 		int chance = (int) (Math.random() * 10);
 		
 		if (chance > 4) {
 			return true;
 		}
 		else {
 			return false;
 		}
  	}
  	
  	
  	
 }