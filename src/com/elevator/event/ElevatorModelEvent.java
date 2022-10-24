package com.elevator.event;

import com.elevator.Location;

public class ElevatorModelEvent {
	
	/* Место, в котором произошло событие ElevatorModelEvent */
	private Location location;
	
	/* Объект, который инициализировал событие ElevatorModelEvent */
	private Object source;
	
	public ElevatorModelEvent(Object source, Location location) {
		setSource(source);
		setLocation(location);
	}

	private void setLocation(Location eventLocation) {
		location = eventLocation;
	}

	private void setSource(Object eventSource) {
		source = eventSource;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public Object getSource() {
		return source;
	}
}
