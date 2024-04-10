import java.util.ArrayList;
import java.util.List;

public class Vehicle implements ICar {
	protected String ID;
    protected String brand;
    protected int publishYear;
    protected float price;
    protected String color;

    public Vehicle(String ID, String brand, int publishYear, float price, String color) {
        this.ID = ID;
        this.brand = brand;
        this.publishYear = publishYear;
        this.price = price;
        this.color = color;
    }

    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Brand: " + brand);
        System.out.println("Publish Year: " + publishYear);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
    }

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
    
}