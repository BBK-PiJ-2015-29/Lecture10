/**
 * A SmartPhone is a MobilePhone with more functionality.
 */ 
public class SmartPhone extends MobilePhone{
	
	/**
	 * Constructor which calls the super constructor
	 *
	 */
	public SmartPhone() {
		super();
	}
	
	/**
	 * Method which initialises a web browser and accesses a given
	 * web address.
	 *
	 * @param address the web address to be accessed.
	 */
	public void browseWeb(String address) {
		System.out.println("Now accessing " + address);
	}
	
	/**
	 * Method which returns the gps coordinates of the phone
	 *
	 * @return a String containing the gps coordinates
	 */
	public String findPosition() {
		String position = "";
		position = "51.52426545314124,-0.1326239258051";
		return "Your position is: " + position;
	}
}