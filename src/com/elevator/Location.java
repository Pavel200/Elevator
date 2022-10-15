package com.elevator;

public abstract class Location {
	protected String locationName;
	
	
	public String getLocationName() {
		return locationName;
	}
	
	abstract Door getDoor();
	abstract Button getButton();
}
