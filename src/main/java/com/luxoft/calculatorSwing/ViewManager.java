package com.luxoft.calculatorSwing;

public class ViewManager {
	
	private static ViewManager viewManager;
	
	private CalculatorUI calculatorUI;

	public static ViewManager getInstance() {
		if (viewManager == null) {
			viewManager = new ViewManager();
		}
		return viewManager;
	}
	
	public void createUI() {
		calculatorUI = new CalculatorUI();
	}

}
