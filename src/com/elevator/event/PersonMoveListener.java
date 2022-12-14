package com.elevator.event;

public interface PersonMoveListener {
	
	public void personCreated(PersonMoveEvent personMoveEvent);
	public void personArrived(PersonMoveEvent personMoveEvent);
	public void personDeparted(PersonMoveEvent personMoveEvent);
	public void personPressedButton(PersonMoveEvent personMoveEvent);
	public void personEntered(PersonMoveEvent personMoveEvent);
	public void personExited(PersonMoveEvent personMoveEvent);
}
