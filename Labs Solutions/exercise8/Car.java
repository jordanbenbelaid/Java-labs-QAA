package exercise8;

public class Car {
	private String model;
	
	public Car(String model) {
		setModel(model);
	}
	
	public String getModel() {
		return model;
	}
	private void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	private void setSpeed(int speed) {
		this.speed = speed;
	}
	public void getToSixty() {
		setSpeed(60);
	}
	public void accelerate(int seconds) {
		setSpeed(speed + (5 * seconds));
	}
	public String getDetails() {
		return "Model:" + model + ", Speed:" + speed;
	}
	private int speed;
}
