package com.elevator;

public class Floor extends Location{
	private int floorNumber;
	private int capacity = 1;
	
	public Floor() {}
	
	@Override
	public Door getDoor() {
		return null;
	}
	
	@Override
	public Button getButton() {
		return null;
	}
}
