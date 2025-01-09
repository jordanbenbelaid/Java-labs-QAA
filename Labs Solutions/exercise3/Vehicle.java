package exercise3;


public class Vehicle {
	private int distanceTravelled;
	private int speed;
	private int lane;
	private RegistrationPlate registrationPlate;
	
	private static int count=0;
	private static final int MAX_SPEED = 200;
	private static final int MIN_SPEED = 0;

	public Vehicle(int lane, int speed) throws Exception {
		this.registrationPlate= RegistrationPlateFactory.getNextRegistrationPlate();
		if (this.registrationPlate == null)
			System.out.println("No registration plates were available.");

		Vehicle.count++;
		this.lane = lane;
		this.speed = speed;
	}
	public static int getCount() {
		return Vehicle.count;
	}

	public int getSpeed() {
		return this.speed;
	}
	public int getDistanceTravelled() {
		return this.distanceTravelled;
	}

	public void setSpeed(int speed) {
		if (speed > MAX_SPEED)
			speed = MAX_SPEED ;
		
		if (speed < MIN_SPEED)
			speed = MIN_SPEED;

		this.speed = speed;
	}

	public void brake(int amount) {
		setSpeed(getSpeed() - amount);
	}

	public void accelerate(int amount) {
		setSpeed(getSpeed() + amount);		
		distanceTravelled += getSpeed();
	}

	public String getDetails() {
		return "Lane:" + lane + ", speed:" + speed + ", distance travelled:" + distanceTravelled;
	}
}
