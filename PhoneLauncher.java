/**
 * Class to test functionality of the SmartPhone class
 *
 */
public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher myTest = new PhoneLauncher();
		myTest.launch();
	}
	/**
	 * Launch method, main code run from here.
	 *
	 */
	public void launch() {
		SmartPhone samsung = new SmartPhone("Samsung");
		samsung.call("0208 445 3220");
		samsung.call("07743 547 689");
		samsung.call("07864 234 488");
		samsung.call("0207 447 2330");
		samsung.call("00 122 3423 554");
		
		System.out.println("\nLast 10 numbers:");
		System.out.println(samsung.printLastNumbers());
		
		samsung.ringAlarm("Wake up!");
		samsung.playGame("Angry Birds");
		
		samsung.browseWeb("http://www.google.co.uk");
		System.out.println(samsung.findPosition());
		System.out.println();
		
	}
}