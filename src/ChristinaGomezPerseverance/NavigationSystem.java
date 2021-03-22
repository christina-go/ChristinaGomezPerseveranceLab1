/**
 * 
 */
package ChristinaGomezPerseverance;

/**
 * @author christinagomez
 *
 */
public class NavigationSystem implements SelfCheckCapable {
	
	Integer NumberOfCameras;
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
	 * This is the NavigationSystem constructor method - it creates an instance of 
	 * NavigationSystem when called
	 * 
	 */
	
	public NavigationSystem() {
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
