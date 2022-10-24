package com.elevator.event;

import com.elevator.Location;

public class ElevatorMoveEvent extends ElevatorModelEvent {

	public ElevatorMoveEvent(Object source, Location location) {
		super(source, location);
	}
}
