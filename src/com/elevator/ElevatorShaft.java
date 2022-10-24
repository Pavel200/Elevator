package com.elevator;

import com.elevator.event.ButtonEvent;
import com.elevator.event.ButtonListener;
import com.elevator.event.DoorEvent;
import com.elevator.event.DoorListener;
import com.elevator.event.LightEvent;
import com.elevator.event.LightListener;

public class ElevatorShaft implements LightListener, ButtonListener, DoorListener {
	private Button buttonFloor1;
	private Button buttonFloor2;
	private Light lightFloor1;
	private Light lightFloor2;
	private Door doorFloor1;
	private Door doorFloor2;
	private Elevator elevator;
	
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
	
	@Override
	public void lightTurnedOn(LightEvent lightEvent) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void lightTurnedOff(LightEvent lightEvent) {
		// TODO Auto-generated method stub
	}
}
