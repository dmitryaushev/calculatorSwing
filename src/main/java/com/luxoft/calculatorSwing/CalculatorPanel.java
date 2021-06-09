package com.luxoft.calculatorSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorPanel extends JPanel {

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
	
	
	public CalculatorPanel(JFrame frame) {
		setLayout(new BorderLayout());
		
		text = new JTextField();
		text.setEditable(false);
		text.setFont(new Font("serif", Font.BOLD, 22));
		
		button0 = new JButton("0");
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		
		buttonComa = new JButton(".");
		buttonComa.setFont(new Font("serif", Font.BOLD, 22));
		buttonResult = new JButton("=");
		buttonResult.setFont(new Font("serif", Font.BOLD, 22));
		buttonAddition = new JButton("+");
		buttonAddition.setFont(new Font("serif", Font.BOLD, 22));
		buttonSubtraction = new JButton("-");
		buttonSubtraction.setFont(new Font("serif", Font.BOLD, 22));
		buttonMultiplication = new JButton("*");
		buttonMultiplication.setFont(new Font("serif", Font.BOLD, 22));
		buttonDivision = new JButton("/");
		buttonDivision.setFont(new Font("serif", Font.BOLD, 22));
		buttonClear = new JButton("C");
		
		JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(buttonAddition);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(buttonSubtraction);
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(buttonMultiplication);
		buttonPanel.add(buttonComa);
		buttonPanel.add(button0);
		buttonPanel.add(buttonClear);
		buttonPanel.add(buttonDivision);
		
		add(text, BorderLayout.NORTH);
		add(buttonPanel);
		add(buttonResult, BorderLayout.SOUTH);
		
		frame.add(this);
	}
}
