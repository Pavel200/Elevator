package com.elevator;

import com.elevator.event.PersonMoveEvent;
import com.elevator.event.PersonMoveListener;

public class ElevatorModel implements PersonMoveListener {
	
	public void addPerson() {}

	@Override
	public void personCreated(PersonMoveEvent personMoveEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void personArrived(PersonMoveEvent personMoveEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void personDeparted(PersonMoveEvent personMoveEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void personPressedButton(PersonMoveEvent personMoveEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void personEntered(PersonMoveEvent personMoveEvent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void personExited(PersonMoveEvent personMoveEvent) {
		// TODO Auto-generated method stub
	}
}
