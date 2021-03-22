/**
 * 
 */
package ChristinaGomezPerseverance;

/**
 * @author christinagomez
 *
 */
public abstract class Suspension implements SelfCheckCapable {

	Integer NumberOfWheels;
	Integer NumberOfLegs;
	String Status;
	
	/**
	*
	* This is the Tilt method - it distributes weight on different
	* wheels of the rover as it traverses the Mars landscape (going uphill, etc)
	*
	*/
	
	void Tilt() {
		
	}
	
	/**
	*
	* This is the Raise method - it will raise the height of the legs if the rover
	* needs to go over a tall rock
	*
	*/
	
	void Raise() {
		
	}
	
	/**
	*
	* This is the Lower method - it will lower the height of the legs if the rover
	* needs to be lower to the ground for collecting samples
	*
	*/
	
	void Lower() {
		
	}
	
	/**
	*
	* This is the Alert method - it will send an alert to the computer if there
	* is a problem with an aspect of the suspension (tilt close to max, etc)
	*
	*/
	
	void Alert() {
		
	}
	
	/**
	 * 
	 * This is the Suspension constructor method - it creates an instance of 
	 * Sensor when called
	 * 
	 */
	
	public Suspension() {
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
