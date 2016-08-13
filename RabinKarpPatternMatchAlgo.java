package com.tgt.qa.tests.csrportal;

public class RabinKarpPatternMatchAlgo 
{
	public static final int MAX_PRIME = 3;
	public static final  double EPSILON = 0.01;
	
	public long hashIt(String str, int i)
	{
		long n = 0;
		
		if (i <= 0)
			return n;
		
		//System.out.println(str.charAt(i) + "=" + str.charAt(i)*Math.pow(MAX_PRIME, i));
		
		n += (long) (str.charAt(i) * Math.pow(MAX_PRIME, i));
		return  (long) (n  + hashIt(str, i - 1));
	}
	
	public long rehashIt(String s, int oldIndex, int newIndex, long oldHash, int patternTextLength)
	{
		long temp = oldHash - s.charAt(oldIndex);
		
		temp = temp / MAX_PRIME;
		
		temp += (long) ((s.charAt(newIndex) * Math.pow(MAX_PRIME, patternTextLength - 1)));
		
		System.out.println(String.format("MAIN STR = %s; SLOT = %s;  NEW CHAR = %s; i = %s;  OLD CHAR = %s; OLD HASH = %s;  NEW HASH = %s", 
				s, s.substring(oldIndex+1, newIndex), s.charAt(newIndex), newIndex, s.charAt(oldIndex), oldHash,  temp));
		
		return temp;
	}
	
	public int patternMatch(String s1, String s2)
	{
		int mainTextLength = s1.length();
		int patternTextLength = s2.length();
		
		long mainTextHash = hashIt(s1, patternTextLength - 1);
		long patternHash = hashIt(s2, patternTextLength - 1);
		
		int countofPatternMatch = 0;
		
		if (mainTextLength < patternTextLength)
		{
			return -1;
		}
		
		
		for (int i = 1; i <= mainTextLength - patternTextLength+1; i++)
		{
			if (Math.abs(mainTextHash - patternHash) < EPSILON && eachCharMatch(s1.toCharArray(), i - 1, s2.toCharArray()))
			{
				countofPatternMatch++;
			}
			
			if (i < mainTextLength - patternTextLength+1)
			{
				mainTextHash = rehashIt(s1, i - 1, i + patternTextLength - 1, mainTextHash, patternTextLength);
			}
		}
		
		return countofPatternMatch;
	}
	
	private boolean eachCharMatch(char[] c1, int k, char[] c2)
	{
		for (int i = 0; i < c2.length; i++)
		{
			if (c1[i+k] != c2[i])
				return false;
		}
		
		return true;
	}
}
