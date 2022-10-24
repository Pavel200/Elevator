package com.elevator.event;

import com.elevator.Location;

public class DoorEvent extends ElevatorModelEvent {

	public DoorEvent(Object source, Location location) {
		super(source, location);
	}
}
