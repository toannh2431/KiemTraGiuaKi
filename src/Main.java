
public class Main {
	public static void main(String[] args) {
		VehiclesManagement mng = new VehiclesManagement();
		
		Car car = new Car("S1", "Honda", 2010, 20000000, "red", 4, "4 xilanh");
		MotorCycle motor = new MotorCycle("S2", "Yamaha", 2024, 50000000, "Black Brown", 155);
		Truck truck = new Truck("S3", "Toyota", 2015, 100000000, "Yellow", 1500);
		
		mng.addVehicle(car);
		mng.addVehicle(motor);
		mng.addVehicle(truck);
		
		mng.showAllVehicles();
		
		mng.removeVehicle("S1");
		
		mng.showAllVehicles();
		
		mng.saveToFile("vehicles.txt");
		
		mng.saveCarDatabase(car);
		mng.SaveMotorcycleDatabase(motor);
		mng.SaveTruckDatabase(truck);
}
}