/**
 * 
 */
package ChristinaGomezPerseverance;

/**
 * @author christinagomez
 *
 */
public class Camera implements SelfCheckCapable {
	
	String CameraType;
	String Location;
	String Status;
	
	/**
	 * 
	 * This is the RecordVideo method - it will record video in a stream that 
	 * can be viewed by Mission Control on Earth 
	 * 
	 */
	
	void RecordVideo() {
		
		
	}
	
	/**
	 * 
	 * This is the TakePicture method - it will take a picture that can be 
	 * sent back to Mission Control on Earth
	 * 
	 */
	
	void TakePicture() {
		
		
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
	 * This is the Camera constructor method - it creates an instance of 
	 * Camera when called
	 * 
	 */
	
	public Camera() {
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
