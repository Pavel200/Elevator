package com.elevator;

import com.elevator.event.ElevatorMoveEvent;
import com.elevator.event.ElevatorMoveListener;

public class Door implements ElevatorMoveListener {
	private boolean open = false;
	
	public Door() {}
	
	public void openDoor() {
		
	}
	public void closeDoor() {}

	@Override
	public void elevatorDeparted(ElevatorMoveEvent moveEvent) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elevatorArrived(ElevatorMoveEvent moveEvent) {
		// TODO Auto-generated method stub
	}
}
