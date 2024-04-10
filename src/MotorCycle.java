
public class MotorCycle extends Vehicle{
	private double capacity;

	public MotorCycle(String ID, String brand, int publishYear, float price, String color, double capacity) {
		super(ID, brand, publishYear, price, color);
		this.capacity = capacity;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Capacity: "+ capacity);
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
}
