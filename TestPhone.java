public class TestPhone {
	public static void main(String[] args) {
		TestPhone myTest = new TestPhone();
		myTest.launch();
	}
	
	public void launch() {
		MobilePhone nokia = new MobilePhone();
		nokia.call("0208 445 3220");
		nokia.call("07743 547 689");
		nokia.call("07864 234 488");
		nokia.call("0207 447 2330");
		
		System.out.println(nokia.printLastNumbers());
	}
}