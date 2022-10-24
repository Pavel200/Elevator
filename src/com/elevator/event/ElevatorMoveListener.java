package com.elevator.event;
/* Методы, вызываемые, когда лифт прибывает или убывает */

public interface ElevatorMoveListener {
	
	/* Вызывается, когда лифт убывает */
	public void elevatorDeparted(ElevatorMoveEvent moveEvent);
	
	/* Вызывается, когда лифт прибывает */
	public void elevatorArrived(ElevatorMoveEvent moveEvent);
}
