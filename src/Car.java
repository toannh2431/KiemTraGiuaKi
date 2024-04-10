import java.util.Scanner;

public class Car extends Vehicle {
	private int slots;
	private String engineType;
	public Car(String ID, String brand, int publishYear, float price, String color, int slots, String engineType) {
		super(ID, brand, publishYear, price, color);
		this.slots = slots;
		this.engineType = engineType;
	}
	public int getSlots() {
		return slots;
	}
	public void setSlots(int slots) {
		this.slots = slots;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("Slots: "+ slots);
		System.out.println("EngineType: "+ engineType);
	}
	
	
}
