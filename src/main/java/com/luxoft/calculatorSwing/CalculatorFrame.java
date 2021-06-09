package com.luxoft.calculatorSwing;

import javax.swing.JFrame;

public class CalculatorFrame extends JFrame {

	public CalculatorFrame() {
		setBounds(100, 100, 300, 300);
		setTitle("Calculator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(new CalculatorPanel(this));
		setVisible(true);
		setResizable(false);
	}
}
