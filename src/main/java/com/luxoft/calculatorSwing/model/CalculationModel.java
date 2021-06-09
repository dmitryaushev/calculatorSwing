package com.luxoft.calculatorSwing.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.luxoft.calculatorSwing.interfaces.Observable;
import com.luxoft.calculatorSwing.interfaces.Observer;

public class CalculationModel implements Observable {
	
	private double firstOperand;
	private double secondOperand;
	private String operation;
	
	private List<Observer> observers = new ArrayList<>();

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(firstOperand, secondOperand, operation));
	}
	
	public void setParameters(Map<String, String> parameters) {
		firstOperand = Double.valueOf(parameters.get("firstOperand"));
		secondOperand = Double.valueOf(parameters.get("secondOperand"));
		operation = parameters.get("operation");
		notifyObservers();
	}

}
