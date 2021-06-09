package com.luxoft.calculatorSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorUISupport {

	private String firstOperand = "";
	private String secondOperand = "";
	private String operation = "";

	private CalculatorUI calculatorUI;

	private JTextField text;

	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonComa;
	private JButton buttonResult;
	private JButton buttonAddition;
	private JButton buttonSubtraction;
	private JButton buttonMultiplication;
	private JButton buttonDivision;
	private JButton buttonClear;

	public CalculatorUISupport(CalculatorUI calculatorUI) {
		this.calculatorUI = calculatorUI;
		createCalculatorListeners();
	}

	private void createCalculatorListeners() {
		getElements();
		addListener(button0);
		addListener(button1);
		addListener(button2);
		addListener(button3);
		addListener(button4);
		addListener(button5);
		addListener(button6);
		addListener(button7);
		addListener(button8);
		addListener(button9);
		addListener(buttonComa);
		addOperationListener(buttonAddition);
		addOperationListener(buttonSubtraction);
		addOperationListener(buttonMultiplication);
		addOperationListener(buttonDivision);

		buttonClear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				text.setText("");
				firstOperand = "";
				secondOperand = "";
				operation = "";
			}
		});
		buttonResult.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String result = "";
				
				switch (operation) {
				case "+":
					result = String.valueOf(Double.valueOf(firstOperand) + Double.valueOf(secondOperand));
					break;
				case "-":
					result = String.valueOf(Double.valueOf(firstOperand) - Double.valueOf(secondOperand));
					break;
				case "*":
					result = String.valueOf(Double.valueOf(firstOperand) * Double.valueOf(secondOperand));
					break;
				case "/":
					result = String.valueOf(Double.valueOf(firstOperand) / Double.valueOf(secondOperand));
					break;
				default:
					break;
				}
				text.setText(result);
			}
		});
	}

	private void getElements() {
		text = calculatorUI.getText();
		button0 = calculatorUI.getButton0();
		button1 = calculatorUI.getButton1();
		button2 = calculatorUI.getButton2();
		button3 = calculatorUI.getButton3();
		button4 = calculatorUI.getButton4();
		button5 = calculatorUI.getButton5();
		button6 = calculatorUI.getButton6();
		button7 = calculatorUI.getButton7();
		button8 = calculatorUI.getButton8();
		button9 = calculatorUI.getButton9();
		buttonComa = calculatorUI.getButtonComa();
		buttonResult = calculatorUI.getButtonResult();
		buttonAddition = calculatorUI.getButtonAddition();
		buttonSubtraction = calculatorUI.getButtonSubtraction();
		buttonMultiplication = calculatorUI.getButtonMultiplication();
		buttonDivision = calculatorUI.getButtonDivision();
		buttonClear = calculatorUI.getButtonClear();
	}

	private void addListener(final JButton button) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText() + e.getActionCommand());
				if (operation.isEmpty()) {
					firstOperand = text.getText();
				} else {
					secondOperand = secondOperand + e.getActionCommand();
				}
			}
		});
	}

	private void addOperationListener(final JButton button) {
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text.setText(text.getText() + button.getText());
				operation = button.getText();
			}
		});
	}
}
