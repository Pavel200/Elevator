package com.elevator;

import com.elevator.event.DoorEvent;
import com.elevator.event.DoorListener;

public class Person implements DoorListener {
	private int ID;
	private boolean moving = true;
	private Location location;
	
	public Person() {
		
	}
	
	/* Методы интерфейса DoorListener */
	@Override
	public void doorOpened(DoorEvent doorEvent) {
		
	}

	@Override
	public void doorClosed(DoorEvent doorEvent) {
		
	}
}
