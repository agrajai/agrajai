package com.tgt.qa.tests.csrportal;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class testHorsePool 
{
	HorsepoolPatternMatch hpm = new HorsepoolPatternMatch();
	
	@Test
	public void testHPBVT()
	{
		String text = "trusthardtoothbrushes";
		String pattern = "tooth";
		
		hpm.fillHashtable(pattern);
		
		assertTrue(pattern + " does not contain 4 matches", hpm.horsepoolPatternMatch(text, pattern) == 1);
	}
}
