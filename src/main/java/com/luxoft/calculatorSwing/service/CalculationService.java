package com.luxoft.calculatorSwing.service;

import com.luxoft.calculatorSwing.interfaces.Observer;
import com.luxoft.calculatorSwing.logic.SimpleCalculator;
import com.luxoft.calculatorSwing.ui.ViewManager;

public class CalculationService implements Observer {
	
	private SimpleCalculator simpleCalculator;
	private ViewManager viewManager;
	
	public CalculationService(SimpleCalculator simpleCalculator) {
		this.simpleCalculator = simpleCalculator;
		this.viewManager = ViewManager.getInstance();
	}

	@Override
	public void update(Double firstOperand, Double secondOperand, String operation) {
		calculation(firstOperand, secondOperand, operation);
	}
	
	private void calculation(Double firstOperand, Double secondOperand, String operation) {
		Double resultDouble = simpleCalculator.makeCalculation(firstOperand, secondOperand, operation);
		String result = String.valueOf(resultDouble);
		viewManager.getCalculateUI().getText().setText(result);
	}

}
