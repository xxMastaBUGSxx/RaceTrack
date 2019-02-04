
public class RaceCar implements IRacer {
	String myName;
	double myMaxSpeed;
	double myAcceleration;
	double myCurrentSpeed;
	
	public String getName(){
		return myName;
	}
	
	public double getCurrentSpeed() {
		return myCurrentSpeed;
	}
	
	public void resetCurrentSpeed() {
		myCurrentSpeed = 0.0;
	}
	
	public void accelerate() {
		myCurrentSpeed += myAcceleration;
		if(myCurrentSpeed > myMaxSpeed) {
			myCurrentSpeed = myMaxSpeed;
		}

	}

	public RaceCar(String myName, double myMaxSpeed, double myAcceleration) {
		super();
		this.myName = myName;
		this.myMaxSpeed = myMaxSpeed;
		this.myAcceleration = myAcceleration;
		this.myCurrentSpeed = 0.0;
	}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
