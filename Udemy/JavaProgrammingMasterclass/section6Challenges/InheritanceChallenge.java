package section6Challenges;

import java.util.Scanner;

public class InheritanceChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	}

}

class Vehicle {
	private String size;
	private String name;
	private String direction;
	private int speed;

	public String getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public String getDirection() {
		return direction;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Vehicle(String name, String size) {
		this.name = name;
		this.size = size;
		this.direction = "forward";
		this.speed = 0;
	}
	
	public void steer(String direction) {
		this.direction = direction;
		System.out.println("Vehicle.steer(): Now steering " + direction);
	}
	
	public void move(int speed, String direction) {
		this.speed = speed;
		System.out.println("Vehicle.move(): Going " + direction + " at a speed of " + speed );
	}
	
	public void stop() {
		this.speed = 0;
	}
}

class Car extends Vehicle{
	
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		
		
	}
	
	public void changeGear(int currentGear) {
		this.currentGear = currentGear;
		System.out.println("Car.setCurrentGear(): Changed to gear " + this.currentGear + ".");
	}
	
	public void changeSpeed(int speed, String direction) {
		move(speed, direction);
		System.out.println("Car.changeVelocity(): Going " + direction + " at a speed of " + speed );
	}
	
}