package com.elevator;

import com.elevator.event.ElevatorMoveEvent;
import com.elevator.event.ElevatorMoveListener;

public class Light implements ElevatorMoveListener {
	private boolean lightOn = false;
	
	public Light() {}
	
	public void turnOnLight() {}
	
	public void turnOffLight() {}

	@Override
	public void elevatorDeparted(ElevatorMoveEvent moveEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void elevatorArrived(ElevatorMoveEvent moveEvent) {
		// TODO Auto-generated method stub
	}
}
