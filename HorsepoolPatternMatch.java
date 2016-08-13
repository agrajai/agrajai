package com.tgt.qa.tests.csrportal;

import java.util.Hashtable;

public class HorsepoolPatternMatch 
{
	public Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
	
	public void fillHashtable(String s)
	{
		for (int i = 0; i < s.length(); i++) 
		{
			if (i != s.length() - 1)
				h.put(s.charAt(i), s.length() - i - 1);
			else if (!h.contains(s.charAt(i)))
				h.put(s.charAt(i), s.length());
		}
	}
	
	public int horsepoolPatternMatch(String text, String pattern)
	{
		if (text == null || pattern == null)
			return 0;
		
		if (text.length() < pattern.length())
			return 0;
		
		int startIndex = 0;
		int patternLen = pattern.length() - 1;
		int textLen = text.length() - 1;
		int count = 0;
		int offset = 0;
		
		while (startIndex < textLen)
		{
			while (patternLen > 0 && text.charAt(startIndex + patternLen) == pattern.charAt(patternLen))
			{
				System.out.println("TEXT char: " + text.charAt(startIndex + patternLen) + "  PATTERN char: " + pattern.charAt(patternLen));
				
				if (patternLen != 0)
					patternLen--;
			}
			
			if (patternLen == 0)
			{
				count++;
				patternLen = pattern.length() - 1;
				startIndex = patternLen;
			}
			else if (h.containsKey(text.charAt(patternLen)))
			{
				offset = h.get(text.charAt(patternLen));
				startIndex += offset;
			}
			else
			{
				startIndex += pattern.length();
				patternLen = pattern.length() - 1;
			}
		}
		
		return count;
	}
}
