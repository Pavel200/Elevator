package com.elevator.event;

import com.elevator.Location;

public class BellEvent extends ElevatorModelEvent {

	public BellEvent(Object source, Location location) {
		super(source, location);
	}
}
