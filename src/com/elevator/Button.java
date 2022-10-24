package com.elevator;

import com.elevator.event.ElevatorMoveEvent;
import com.elevator.event.ElevatorMoveListener;

public class Button implements ElevatorMoveListener {
	
	private boolean pressed = false;
	
	public Button() {}
	
	public void resetButton() {
		
	}
	public void pressButton() {
		
	}

	@Override
	public void elevatorDeparted(ElevatorMoveEvent moveEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void elevatorArrived(ElevatorMoveEvent moveEvent) {
		// TODO Auto-generated method stub
	}
}
