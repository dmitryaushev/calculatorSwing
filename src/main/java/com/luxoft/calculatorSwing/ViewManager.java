package com.luxoft.calculatorSwing;

public class ViewManager {
	
	private static ViewManager viewManager;
	
	private CalculatorUI calculatorUI;
	private CalculatorUISupport calculatorUISupport;
	

	public static ViewManager getInstance() {
		if (viewManager == null) {
			viewManager = new ViewManager();
		}
		return viewManager;
	}
	
	public void createUI() {
		calculatorUI = new CalculatorUI();
		calculatorUISupport = new CalculatorUISupport(calculatorUI);
	}

}
