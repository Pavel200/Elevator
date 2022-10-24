package com.elevator.event;

import com.elevator.Location;

public class PersonMoveEvent extends ElevatorModelEvent {

	public PersonMoveEvent(Object source, Location location) {
		super(source, location);
	}
}
