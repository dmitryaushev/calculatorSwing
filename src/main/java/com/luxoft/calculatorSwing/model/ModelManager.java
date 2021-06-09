package com.luxoft.calculatorSwing.model;

import java.util.Map;

import com.luxoft.calculatorSwing.logic.SimpleCalculator;
import com.luxoft.calculatorSwing.service.CalculationService;

public class ModelManager {

	public static ModelManager modelManager;
	
	private CalculationModel calculationModel;
	private CalculationService calculationService;
	
	public static ModelManager getInstance() {
		if (modelManager == null) {
			modelManager = new ModelManager();
		}
		return modelManager;
	}
	
	public void createModel() {
		calculationService = new CalculationService(new SimpleCalculator());
		calculationModel = new CalculationModel();
		calculationModel.addObserver(calculationService);
	}
	
	public void updateModelFromUI(Map<String, String> parameters) {
		calculationModel.setParameters(parameters);
	}
}
