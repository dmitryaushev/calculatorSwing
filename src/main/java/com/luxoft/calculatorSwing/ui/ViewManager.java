package com.luxoft.calculatorSwing.ui;

import com.luxoft.calculatorSwing.model.ModelManager;

public class ViewManager {
	
	private static ViewManager viewManager;
	
	private CalculatorUI calculatorUI;
	private CalculatorUISupport calculatorUISupport;
	
	private ModelManager modelManager;
	

	public static ViewManager getInstance() {
		if (viewManager == null) {
			viewManager = new ViewManager();
		}
		return viewManager;
	}
	
	public void createUI() {
		calculatorUI = new CalculatorUI();
		calculatorUISupport = new CalculatorUISupport(calculatorUI);
		
		modelManager = ModelManager.getInstance();
		modelManager.createModel();
	}

	public CalculatorUI getCalculateUI() {
		return calculatorUI;
	}

}
