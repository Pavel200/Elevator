package com.elevator.event;

import com.elevator.Location;

public class ButtonEvent extends ElevatorModelEvent {

	public ButtonEvent(Object source, Location location) {
		super(source, location);
	}
}
