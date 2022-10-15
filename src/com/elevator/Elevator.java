package com.elevator;

public class Elevator extends Location {
	
	/* атрибуты класса */
	private boolean moving = false;
	private boolean summoned = false;
	private Location currentFloor;
	private Location destinationFloor;
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
	
	@Override
	public String getLocationName() {
		return "Elevator";
	}
	
	@Override
	public Button getButton() {
		return elevatorButton;
	}
	
	@Override
	public Door getDoor() {
		return elevatorDoor;
	}
}
