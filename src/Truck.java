
public class Truck extends Vehicle{
	private double loadWeight;

	public Truck(String ID, String brand, int publishYear, float price, String color, double loadWeight) {
		super(ID, brand, publishYear, price, color);
		this.loadWeight = loadWeight;
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("LoadWeight :" + loadWeight);
	}
	public double getLoadWeight() {
		return loadWeight;
	}
	public void setLoadWeight(double loadWeight) {
		this.loadWeight = loadWeight;
	}
	
}
