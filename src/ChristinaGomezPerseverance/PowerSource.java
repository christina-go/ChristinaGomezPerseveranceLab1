/**
 * 
 */
package ChristinaGomezPerseverance;

/**
 * @author christinagomez
 *
 */
public class PowerSource implements SelfCheckCapable {
	
	Integer PowerLevel;
	String Status;
	
	/**
	 * 
	 * This is the Alert method - it will signal an alert to the rover's
	 * computer
	 * 
	 */
	
	void Alert() {
		
		
	}
	
	/**
	 * 
	 * This is the Antenna constructor method - it creates an instance of 
	 * Antenna when called
	 * 
	 */
	
	public PowerSource() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
