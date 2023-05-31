package vehicledemo;

public abstract class Vehicle {
	String maker;
	String model;
	int year;
	String fuelType;
	String km;
	int distanceTravelled;
	int fuel;
	public void drive() {
		System.out.println("main");
	}
	public double milege() {
		return distanceTravelled / fuel;
	}
}
