package exercise8;

public class RacingCar extends Car{
	String driver;
	int turboFactor;

	public RacingCar(String model) {
		super(model);
	}

	
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getTurboFactor() {
		return turboFactor;
	}
	public void setTurboFactor(int turboFactor) {
		this.turboFactor = turboFactor;
	}
	
	public void race() {
		System.out.println("Racing!");
	}
	
	@Override
	public void accelerate(int seconds) {
		super.accelerate(seconds + getSpeed() * turboFactor);
	}

	@Override
	public String getDetails() {
		return super.getDetails() + "Driver:" + driver + ", Turbo factor:" + turboFactor;
	}


}
