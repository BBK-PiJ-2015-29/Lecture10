/**
 * This class represents old, pre-digital phones.
 *
 * It only has one method
 */
public class OldPhone implements Phone {
	
	/**
	 * Method will call a number
	 * @param number is the number to be called
	 */
	public void call(String number) {
		System.out.println("Calling " + number);
	}
	
	
}