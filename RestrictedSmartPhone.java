/**
 * A restricted version of the SmartPhone class which 
 * prevents games being played
 *
 * 
 */
public class RestrictedSmartPhone extends SmartPhone {
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}
	@Override
	private void playGame(String name) {
		System.out.println("Now playing " + name);
	}
}