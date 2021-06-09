package com.luxoft.calculatorSwing.logic;

import com.luxoft.calculatorSwing.interfaces.MathOperation;

public class MultiplicationOperation implements MathOperation {

	@Override
	public double calculateResult(Double firstOperand, Double secondOperand) {
		return firstOperand * secondOperand;
	}

}
