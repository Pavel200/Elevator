package com.elevator;

import com.elevator.event.ElevatorMoveEvent;
import com.elevator.event.ElevatorMoveListener;

public class Bell implements ElevatorMoveListener {
	
	public Bell() {}
	
	public void ringBell() {}

	@Override
	public void elevatorDeparted(ElevatorMoveEvent moveEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void elevatorArrived(ElevatorMoveEvent moveEvent) {
		// TODO Auto-generated method stub
	}
}
