import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class VehiclesManagement {
	private List<Vehicle> vehicles;

    public VehiclesManagement() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(String ID) {
        Vehicle vehicleToRemove = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.ID.equals(ID)) {
                vehicleToRemove = vehicle;
                break;
            }
        }
        if (vehicleToRemove != null) {
            vehicles.remove(vehicleToRemove);
            System.out.println("Vehicle with ID " + ID + " has been removed.");
        } else {
            System.out.println("Vehicle with ID " + ID + " not found.");
        }
    }

    public void showAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            vehicle.showInfo();
            System.out.println();
        }
    }
    public void saveToFile(String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(vehicles);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Vehicles saved to file: " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving vehicles to file: " + e.getMessage());
        }
    }
    public void loadFromFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            vehicles = (List<Vehicle>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println("Vehicles loaded from file: " + fileName);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading vehicles from file: " + e.getMessage());
        }
    }
    	public int saveCarDatabase(Car car) {
    		int ketQua = 0;
    		try {
    			Connection con = Database.getConnection();
    			Statement st = con.createStatement();
    			String sql = "INSERT INTO car(Id,brand,publishYear,price,color,slots,engineType)"
    					 + " VALUES(\""+car.getID()+"\",\""+car.getBrand()+"\",\""+car.getPublishYear()+"\",\""+car.getPrice()+"\",\""+car.getColor()+"\",\""+car.getSlots()+"\",\""+car.getEngineType()+"\")";
    			ketQua = st.executeUpdate(sql);
    					
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return ketQua;
    	}
    	public int SaveMotorcycleDatabase(MotorCycle m) {
    		int ketQua = 0;
    		try {
    			Connection con = Database.getConnection();
    			Statement st = con.createStatement();
    			String sql = "INSERT INTO motorcycle(Id,brand,publishYear,price,color,capacity)"
    					 + " VALUES(\""+m.getID()+"\",\""+m.getBrand()+"\",\""+m.getPublishYear()+"\",\""+m.getPrice()+"\",\""+m.getColor()+"\",\""+m.getCapacity()+"\")";
    			ketQua = st.executeUpdate(sql);
    					
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return ketQua;
    	}
    	public int SaveTruckDatabase(Truck t) {
    		int ketQua = 0;
    		try {
    			Connection con = Database.getConnection();
    			Statement st = con.createStatement();
    			String sql = "INSERT INTO motorcycle(Id,brand,publishYear,price,color,capacity)"
    					 + " VALUES(\""+t.getID()+"\",\""+t.getBrand()+"\",\""+t.getPublishYear()+"\",\""+t.getPrice()+"\",\""+t.getColor()+"\",\""+t.getLoadWeight()+"\")";
    			ketQua = st.executeUpdate(sql);
    					
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		return ketQua;
    	}
    }

