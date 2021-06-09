package com.luxoft.calculatorSwing.logic;

import com.luxoft.calculatorSwing.interfaces.MathOperation;

public class AdditionOperation implements MathOperation {

	@Override
	public double calculateResult(Double firstOperand, Double secondOperand) {
		return firstOperand + secondOperand;
	}

}
