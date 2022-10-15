package com.elevator;

public class Elevator extends Location {
	
	/* атрибуты класса */
	private boolean moving;
	private boolean summoned;
	private int currentFloor = 1;
	private int destinationFloor = 2;
	private int capacity = 1;
	private int travelTime = 5;
	
	/* объекты класса */
	private Door elevatorDoor;
	private Button elevatorButton;
	private Bell bell;
	
	/* конструктор класса */
	public Elevator() {}
	
	public void ride() {}
	public void requestElevator() {}
	public void enterElevator() {}
	public void exitElevator() {}
	public void departElevator() {}
}
