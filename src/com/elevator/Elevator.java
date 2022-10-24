package com.elevator;

import com.elevator.event.BellEvent;
import com.elevator.event.BellListener;
import com.elevator.event.ButtonEvent;
import com.elevator.event.ButtonListener;
import com.elevator.event.DoorEvent;
import com.elevator.event.DoorListener;

public class Elevator extends Location implements ButtonListener, DoorListener, BellListener {
	
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
	public Elevator() {
		
	}
	
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

	@Override
	public void bellRang(BellEvent bellEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void doorOpened(DoorEvent doorEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void doorClosed(DoorEvent doorEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void buttonPressed(ButtonEvent buttonEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void buttonReset(ButtonEvent buttonEvent) {
		// TODO Auto-generated method stub
	}
}
