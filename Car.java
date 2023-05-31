package vehicledemo;

public class Car extends Vehicle {
	String maker = "Audi";
	String model = "C";
	int year = 2011;
	String fuelType = "petrol";
	int distanceTravelled = 100;
	int fuel = 4; 
	public void drive() {
		System.out.println("Repairing a car");
	}
	public double milege() {
		return distanceTravelled / fuel;
	}
}
