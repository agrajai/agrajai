package com.tgt.qa.tests.csrportal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mvcController 
{
	private mvcView view;
	private mvcModel model;
	
	
	public mvcController(mvcView v, mvcModel m)
	{
		this.view = v;
		this.model = m;
		
		this.view.addCalcListener(new calculateListener());
	}
	
	class calculateListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			int num1, num2 = 0;
			
			try
			{
				num1 = view.getFirstNum();
				num2 = view.getSecondNum();
				
				model.addNumbers(num1, num2);
				
				view.setSum(model.getSum());
				
			}
			catch (NumberFormatException e1)
			{
				System.out.print(e1);
			}
			
		}
	}
}
