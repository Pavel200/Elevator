package com.elevator.event;

import com.elevator.Location;

public class LightEvent extends ElevatorModelEvent {

	public LightEvent(Object source, Location location) {
		super(source, location);
	}
}
