package com.elevator.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import static com.elevator.ElevatorConstants.*;
import com.elevator.ElevatorModel;
import com.elevator.event.ElevatorMoveEvent;
import com.elevator.event.ElevatorMoveListener;
import com.elevator.event.PersonMoveEvent;
import com.elevator.event.PersonMoveListener;

/* Класс ElevatorController модели лифта */

public class ElevatorController extends JPanel {
	private static final long serialVersionUID = 1L;

	/* Контроллер содержит две кнопки JButton */
	private JButton firstControllerButton;
	private JButton secondControllerButton;
	
	/* Ссылка на модель */
	private ElevatorModel elevatorModel;
	
	public ElevatorController(ElevatorModel elevatorModel) {
		
		this.elevatorModel = elevatorModel;
		setBackground(Color.WHITE);
		
		/* Добавление первой кнопки в контроллер */
		firstControllerButton = new JButton("Первый этаж");
		add(firstControllerButton);
		
		/* Добавление второй кнопки в контроллер */
		secondControllerButton = new JButton("Второй этаж");
		add(secondControllerButton);
		
		/* Регистрация анонимного внутреннего класса - обработчика */
		/* событий ActionEvent первой кнопки JButton */
		firstControllerButton.addActionListener(
			
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					/* Создание объекта Person на первом этаже */
					elevatorModel.placePersonOnFloor(FIRST_FLOOR_NAME);
					
					/* Блокировка кнопки - ввод невозможен */
					firstControllerButton.setEnabled(false);
				}
			}
		);
		
		/* Регистрация анонимного внутреннего класса - обработчика */
		/* событий ActionEvent второй кнопки JButton */
		secondControllerButton.addActionListener(
			
			new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					/* Создание объекта Person на втором этаже */
					elevatorModel.placePersonOnFloor(SECOND_FLOOR_NAME);
					
					/* Блокировка кнопки - ввод невозможен */
					secondControllerButton.setEnabled(false);
				}
			}
		);
		
		/* Анонимный внутренний класс разрешает ввод нового объекта
		 * Person на этом этаже, если предыдущий пассажир вошел в лифт */
		elevatorModel.addPersonMoveListener(
			new PersonMoveListener() {
			
				@Override
				public void personEntered(PersonMoveEvent personMoveEvent) {
					/* Определение этажа отправления */
					String location = personMoveEvent.getLocation().getLocationName();
					
					/* Кнопка JButton первого этажа доступна, если это первый этаж */
					if (location.equals(FIRST_FLOOR_NAME)) {
						firstControllerButton.setEnabled(true);
					} else {
						secondControllerButton.setEnabled(true);
					}
				}
				
				@Override
				public void personPressedButton(PersonMoveEvent personMoveEvent) {}
				
				@Override
				public void personExited(PersonMoveEvent personMoveEvent) {}
				
				@Override
				public void personDeparted(PersonMoveEvent personMoveEvent) {}
				
				@Override
				public void personCreated(PersonMoveEvent personMoveEvent) {}
				
				@Override
				public void personArrived(PersonMoveEvent personMoveEvent) {}
			}
		);
	}
}
