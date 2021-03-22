/**
 * 
 */
package ChristinaGomezPerseverance;

/**
 * @author christinagomez
 *
 */
public class Antenna implements SelfCheckCapable {
	
	String Location;
	String AntennaType;
	String Status;
	Integer Frequency;
	
	/**
	 * 
	 * This is the SendInfo method - it will send information from the rover
	 * back to Mission Control on Earth
	 */
	
	void SendInfo() {
		
		
	}
	
	/**
	 * 
	 * This is the ReceiveInfo method - it will receive information from
	 * Mission Control on Earth
	 * 
	 */
	
	void ReceiveInfo() {
		
		
	}
	
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
	
	public Antenna() {
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
