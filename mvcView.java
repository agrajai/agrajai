package com.tgt.qa.tests.csrportal;

import java.awt.event.*;

import javax.swing.*;

public class mvcView extends JFrame 
{
	private int firstNum;
	private int secondNum;
	
	private JTextField num1 = new JTextField(10);
	private JLabel additionSymbol = new JLabel("+");
	private JTextField num2 = new JTextField(10);
	private JLabel equalSymbol = new JLabel("=");
	private JButton calcbutton = new JButton("Calculate");
	private JTextField sum = new JTextField(10);
	
	
	public int getFirstNum() 
	{
		return Integer.parseInt(num1.getText());
	}
	
	public int getSecondNum() {
		return Integer.parseInt(num2.getText());
	}

	public int getSum()
	{
		return Integer.parseInt(num2.getText());
	}
	
	public void setSum(int sum)
	{
		this.sum.setText((Integer.toString(sum)));
	}
	
	mvcView()
	{
		JPanel calcPanel = new JPanel();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		
		calcPanel.add(this.num1);
		calcPanel.add(this.additionSymbol);
		calcPanel.add(this.num2);
		calcPanel.add(this.equalSymbol);
		calcPanel.add(this.calcbutton);
		calcPanel.add(this.sum);
		
		this.add(calcPanel);
	}
	
	void addCalcListener(ActionListener al)
	{
		calcbutton.addActionListener(al);
	}
	
	
}
