/**
 * 
 */
package ChristinaGomezPerseverance;

/**
 * @author christinagomez
 *
 */
public class ComputerSystem implements SelfCheckCapable {
	
	Integer NumberOfComputers;
	String SystemStatus;
	String CurrentNode;
	
	/**
	 * 
	 * This is the FailoverToBackup method - it will failover to the backup
	 * node if there is a problem on the primary
	 * 
	 */
	
	void FailoverToBackup() {
		
		
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
	 * This is the ComputerSystem constructor method - it creates an instance of 
	 * ComputerSystem when called
	 * 
	 */
	
	public ComputerSystem() {
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
