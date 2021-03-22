/**
 * 
 */
package ChristinaGomezPerseverance;

/**
 * @author christinagomez
 *
 */
public class Microphone implements SelfCheckCapable {
	
	String Location;
	String Status;
	
	/**
	 * 
	 * This is the RecordAudio method - it records audio and sends to the computer
	 * to be transmitted back to Mission Control on Earth
	 * 
	 */
	
	void RecordAudio() {
		
		
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
	 * This is the Microphone constructor method - it creates an instance of 
	 * Microphone when called
	 * 
	 */
	
	public Microphone() {
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
