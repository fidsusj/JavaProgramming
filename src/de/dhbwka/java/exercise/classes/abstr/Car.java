package de.dhbwka.java.exercise.classes.abstr;

public class Car extends Vehicle {

	public Car(double vcurr) {
		super(4,140,0,0);
		setSpeed(vcurr);
	}
	
	public Car(double vmax, double vcurr) {
		super(4,vmax,0,0);
		setSpeed(vcurr);
	}
	
	public void info() {
		System.out.println(this.toString());
	}
	
}