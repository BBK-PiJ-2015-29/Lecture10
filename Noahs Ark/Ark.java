/**
 * A class representing the Ark, capable of calling the animals
 */

public class Ark {
	public static void main(String[] args) {
		Ark noahsArk = new Ark();
		noahsArk.launch();
	}

	public void launch() {
		/**
		 * Testing the Bear class
		 */
		System.out.println("Bear:");
		Bear pooh = new Bear("Pooh");
		pooh.call();
		pooh.hunt();
		pooh.reproduce();
		pooh.makeSound();
		System.out.println();
		
		/**
		 * Testing the Beetle class
		 */
		System.out.println("Beetle:");
		Beetle john = new Beetle("John");
		john.call();
		john.reproduce();
		john.makeSound();
		System.out.println();

		/**
		 * Testing the Cat class
		 */
		System.out.println("Cat:");
		Cat garfield = new Cat("Garfield");
		garfield.call();
		garfield.botherHumanForFood();
		garfield.reproduce();
		garfield.makeSound();
		System.out.println();

		/**
		 * Testing the Crocodile class
		 */
		System.out.println("Crocodile:");
		Crocodile tickTock = new Crocodile("Tick tock");
		tickTock.call();
		tickTock.hunt();
		tickTock.reproduce();
		tickTock.makeSound();
		System.out.println();

		/**
		 * Testing the Dog class
		 */
		System.out.println("Dog:");
		Dog scooby = new Dog("Scooby Doo");
		scooby.call();
		scooby.botherHumanForFood();
		scooby.reproduce();
		scooby.makeSound();
		System.out.println();

		/**
		 * Testing the Dolphin class
		 */
		System.out.println("Dolphin:");
		Dolphin flipper = new Dolphin("Flipper");
		flipper.call();
		flipper.hunt();
		flipper.reproduce();
		flipper.makeSound();
		System.out.println();

		/**
		 * Testing the Eagle class
		 */
		System.out.println("Eagle:");
		Eagle roc = new Eagle("Roc");
		roc.call();
		roc.hunt();
		roc.reproduce();
		roc.makeSound();
		System.out.println();

		/**
		 * Testing the Fly class
		 */
		System.out.println("Fly:");
		Fly drosophila = new Fly("Drosophila");
		drosophila.call();
		drosophila.reproduce();
		drosophila.makeSound();
		System.out.println();

		/**
		 * Testing the Frog class
		 */
		System.out.println("Frog:");
		Frog prince = new Frog("Prince");
		prince.call();
		prince.hunt();
		prince.reproduce();
		prince.makeSound();
		System.out.println();

		/**
		 * Testing the Lizard class
		 */
		System.out.println("Lizard:");
		Lizard gordon = new Lizard("Gordon Gekko");
		gordon.call();
		gordon.hunt();
		gordon.reproduce();
		gordon.makeSound();
		System.out.println();

		/**
		 * Testing the Monkey class
		 */
		System.out.println("Monkey:");
		Monkey george = new Monkey("Curious George");
		george.call();
		george.reproduce();
		george.makeSound();
		System.out.println();

		/**
		 * Testing the Pidgeon class
		 */
		System.out.println("Pidgeon:");
		Pidgeon preep = new Pidgeon("Preep");
		preep.call();
		preep.reproduce();
		preep.makeSound();
		System.out.println();

		/**
		 * Testing the Salmon class
		 */
		System.out.println("Salmon:");
		Salmon smokey = new Salmon("Smokey");
		smokey.call();
		smokey.reproduce();
		smokey.makeSound();
		System.out.println();		

		/**
		 * Testing the Shark class
		 */
		System.out.println("Shark:");
		Shark jaws = new Shark("Jaws");
		jaws.call();
		jaws.hunt();
		jaws.reproduce();
		jaws.makeSound();
		System.out.println();

		/**
		 * Testing the Snake class
		 */
		System.out.println("Snake:");
		Snake kaa = new Snake("Kaa");
		kaa.call();
		kaa.hunt();
		kaa.reproduce();
		kaa.makeSound();
		System.out.println();	

		/**
		 * Testing the Whale class
		 */
		System.out.println("Whale:");
		Whale moby = new Whale("Moby");
		moby.call();
		moby.hunt();
		moby.reproduce();
		moby.makeSound();
		System.out.println();	
	}
}
