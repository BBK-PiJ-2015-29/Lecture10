public class PhoneLauncher {
	public static void main(String[] args) {
		PhoneLauncher myTest = new PhoneLauncher();
		myTest.launch();
	}
	
	public void launch() {
		SmartPhone samsung = new SmartPhone();
		samsung.call("0208 445 3220");
		samsung.call("07743 547 689");
		samsung.call("07864 234 488");
		samsung.call("0207 447 2330");
		
		System.out.println(samsung.printLastNumbers());
		
		samsung.ringAlarm("Wake up!");
		samsung.playGame("Angry Birds");
		
		samsung.browseWeb("http://www.google.co.uk");
		System.out.println(samsung.findPosition());
	}
}