package com.tgt.qa.tests.csrportal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

import com.tgt.qa.tests.csrportal.theStack.stackArrayImplementation;

public class Testing
{
//	public String refInnerClass()
//	{
//		testMethods tm = new testMethods();
//		tm.palindrome("");
//		return tm.str;
//	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		List bicycles = new ArrayList();
		
		features kidsBycycle = new kidsBicycles();
		features sportsBycycle = new sportsBicycles();
		
		// Run time polymorphism -- Method overriding
		bicycles.add(kidsBycycle);
		bicycles.add(sportsBycycle);
		
		for(Iterator itr = bicycles.iterator(); itr.hasNext();)
		{
			features f = (features) itr.next();
			f.tyres();
		}
		
		
		// Run time polymorphism - Method overriding
		abstractBicycle sBike = new sportsBicycles();
		abstractBicycle kBike = new kidsBicycles();

		sBike.tyres();
		kBike.tyres();
		
		sportsBicycles sBikes = new sportsBicycles();
		dependencyInjection dependInj = new dependencyInjection();
		dependInj.setBycycleType(sBikes);
		dependInj.tyreType();
		

		
		//Compile time polymorphism - Method overloading
		sportsBicycles sBike1 = new sportsBicycles();
		sBike1.tyres(10);
		sBike1.tyres("MRF");
		
		
		
		//Testing t = new Testing();
		//Testing.testMethods tm = null;//t.new testMethods();
		//System.out.println(t.refInnerClass());
//		System.out.print(testMethods.str);
		
		//Palidrome o/p
//		System.out.println(testMethods.palindrome("dfd"));
		
		//findPrime
		System.out.println("Prime?: "+ testMethods.findPrime(31));
//		
//		//reverse array
//		int[] outArr = tm.reverseArray(new int[] {9,8,7,6,5});
//		
//		for (int i = 0; i < outArr.length; i++) 
//		{
//			System.out.print(outArr[i]);
//			System.out.println("");
//		}
//		
//		//Merge array
//		int[] mergedArr = tm.mergeArrays(new int[] {1,3}, new int[] {1,2,99});
//		
//		for (int i = 0; i < mergedArr.length; i++) 
//		{
//			System.out.println(mergedArr[i]);
//		}
//		
//		//print fib
//		tm.printFib(2);
//		
//		String minmax= tm.findMinMax(new int[] {100,3,4,5,1,2,8,9,0,78});
//		
//		System.out.println("Max/Min Number::" + minmax);
//		
//		testMethods.convertToBinary(90, 2);
//		
//		System.out.println("is anagram?:" + tm.anagram("0.0", "0"));
//		
//		System.out.println("Excel Name:: " + tm.fetchExcelColName(31));
//		System.out.println("Excel Column:: " + tm.fetchExcelColNum("AE"));
//		System.out.println("Longest Palindrome:: " + testMethods.longestPalindrome("MADAMADAAM"));
//		
//		tm.addNumbers(3, 4);
//		tm.multiplynumbers(3, 4);
//		tm.divide(10, 2);
//		System.out.println("Integer to String: " + tm.convertIntToString(1234));
		
//		System.out.println(String.format("factorial recurr:  %s", testMethods.factorialRecurr(7)));
//		System.out.println(String.format("factorial itr:  %s", testMethods.factorialItr(7)));
//		System.out.println(String.format("Remove dupe chars:  %s", testMethods.removeDuplicateChars("sshgjii")));
//		System.out.println(String.format("Repeat Chars :  %s", testMethods.countRepeatChars("aaabbccc%%")));
//		System.out.println(String.format("SubsString prescence count:  %s", testMethods.countSubStringRepeat("abcdabcdabcd", "abcd")));
//		System.out.println(String.format("Smart SubsString :  %s", testMethods.first30CharsWithoutCuttingAnyWords("Featuring " +
//				"stylish rooms and moorings for recreation boats, " +
//				"Room Mate Aitana is a designer hotel built in 2013 " +
//				"on an island in the IJ River in Amsterdam.")));
		
//		testMethods.strPnC("1234", 0, 4);
		
//		System.out.println("is it a balanced braces expression:? " + testMethods.areBracketsBalanced("(A+B) []{+ (F + 0)"));
		
//		testMethods.inverseDeterminant(testMethods.prepDeterminant());
//		testMethods.inverseDeterminantNoXtraSpace((testMethods.prepDeterminant()));
		System.out.println(String.format("Int to String:%s", testMethods.returnIntAsString(-2345)));
	}
	
	public static class testMethods extends Testing
	{
		public static String str = "Jai";
		String[] newStr = null;
		
		
		//In java static class do not have constructors 
		public testMethods()
		{
			str = "jai";
			newStr = new String[] {"a","b"};
		}
//		
//		@Override
//		public String refInnerClass() {
//			// TODO Auto-generated method stub
//			return str;
//		}
		public static boolean palindrome(String s)
		{
			if (s == null || s.length() == 0)
				return false;
			
			if (s.length() == 1)
				return true;
			
			int j = s.length() - 1;
			char[] c = s.toCharArray();
			
			for (int i=0; i < j; i++) 
			{
				if (c[i] == c[j])
				{
					j--;
				}
				else 
				{
					return false;
				}
			}
			
			return true;
		}
	
		public static boolean findPrime(int n)
		{
			if (n <= 1)
			{
				return false;	
			}
			
			for (int i = 2; i*i < n; i++) 
			{
				if (n % i == 0)
				{
					return false;
				}
			}
			
			return true;
		}
		
		//reversing an array
		public int[] reverseArray(int[] arr)
		{
			if (arr == null || arr.length == 0)
			{
				return null;
			}
			
			int j = arr.length -1;
			int temp = 0;
			
			for (int i = 0; i < arr.length; i++, j--) 
			{
				if (i < j)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			return arr;
		}
		
		
		
		//merging 2 sorted arrays of different sizes
		public int[] mergeArrays(int[] a, int[] b)
		{
			if (a.length == 0 && b.length == 0)
			{
				return a;
			}
	
			
			int outArr[] = new int[a.length + b.length];
			
			int i = 0;
			int j = 0;
			int k = 0;
			
			while (i < a.length && j < b.length)
			{
				if (a[i] < b[j])
				{
					outArr[k++] = a[i++];
				}
				else
				{
					outArr[k++] = b[j++];
				}
			}
			
			while (i < a.length)
			{
				outArr[k++] = a[i++];
			}
			
			while (j < b.length)
			{
				outArr[k++] = b[j++];
			}
			
			return outArr;
		}
		
		
		//print fib
		public void printFib(int num)
		{
			int a = 0;
			int b = 1;
			int c = 0;
			
			if (num == 0)
				return;
			
			if (num == 1)
			{
				System.out.println(a);
				System.out.println(b);
				return;
			}
			
			System.out.println(a);
			System.out.println(b);
	
			while (c < num)
			{
				c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}
		
		
		public String reverseString(String s)
		{
			if (s.isEmpty())
			{
				return "Please provide a String";
			}
			
			if (s.length() == 1)
				return s;
	
			char[] c = s.toCharArray();
			int end = 0;
			int start =0;
			
			reverseString(c, start, s.length()-1);
			
			while (end < s.length())
			{
				if (c[end] != 32)
				{
					start = end;
					
					while (c[end] != 32)
					{
						end++;
					}
					
					reverseString(c, start, end);
				}
				end++;
			}
			return s;
		}
		
		private String reverseString(char[] c, int start, int end)
		{
			return null;		
		}
		
		public String findMinMax(int[] num)
		{
			if (num.length == 0)
			{
				return "";
			}
			
			int max = num[0];
			int min = num[0];
			
			for(int i = 0; i < num.length; i++)
			{
				if (num[i] > max)
				{
					max = num[i];
				}
				else if (num[i] < min)
				{
					min = num[i];
				}
			}
			
			return max + ":" + min;	
		}
		
		public static void convertToBinary(int n, int base)
		{
			if (n <= 0)
				return; //"enter a number more than 0";
			
			int b = 0;
			int i = 0;
			String binaryForm = "";
			
			while (n != 0)
			{
				b = n % base;
				n = n / base;
	
				binaryForm = b + binaryForm;
			}
			
//			for (int j = binaryForm.length() - 1; j >= 0; j--)
//			{
//				System.out.print(binaryForm.charAt(j));
//				if (binaryForm.charAt(j) == '1')
//				{
//					i++;
//				}
//			}
			System.out.println();
			System.out.println("Binary Form is: " + binaryForm);
		}
		
		public boolean anagram(String s1, String s2)
		{
			if (s1 == null || s2 == null || (s1.length() != s2.length()))
					return false;
			
			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			
			int sum1 = 0;
			int sum2 = 0;
			
			for (int i =0 ; i < s1.length(); i++)
			{
				sum1 += c1[i];
				sum2 += c2[i];
			}
			
			if (sum1 == sum2)
				return true;
			
			return false;
		}
		
		public static String returnIntAsString(int n)
		{
			int num = 0;
			int remainder = 0;
			String out = "";
			
			if (n == 0)
			{
				return ('0') + out;
			}
			else if (n < 0)
			{
				num = n * -1;
			}
			
			while (num != 0)
			{
				remainder = num % 10;
				num = num / 10;
				
				out = (char) ('0' + remainder) + out;
			}
			
			if (n < 0)
				out = '-' + out;
			
			return out;
		}
		
		public String fetchExcelColName(int col)
		{
			String excelCol = "";
			
			col = col - 1;
			
			while (col >= 0)
			{
				int mod = (col % 26);
				excelCol = String.valueOf(Character.toChars(mod + 'A')) + excelCol;
				col = (col/26) -1 ;
			}
			return excelCol;
		}
		
		public int fetchExcelColNum(String colName)
		{
			int colNum = 0;
			
			for (int i=0; i < colName.length(); i++)
			{
				colNum *= 26;
				colNum += colName.charAt(i) - 'A' + 1;
			}
			
			return colNum;
		}
		
		
		public static String longestPalindrome(String s)
		{
			int len = s.length();
			int max_len = 0;
			int palindromeBeginAt = 0;
			
			boolean[][] palindrome = new boolean[len][len];
			
			//check for 1 char palindrome
			for (int i = 0; i < len-1 ; i++)
			{
				palindrome[i][i] = true;
			}
			
			//check 2 char palindrome
			for (int i = 0; i < len-1; i++)
			{
				if (s.charAt(i) == s.charAt(i+1))
				{
					palindrome[i][i+1] = true;
					palindromeBeginAt = i;
					max_len = 2;
				}
			}
			
			for (int i = 3; i <= len; i++)
			{
				for (int j = 0; j < len-i+1; j++)
				{
					int k = j + i - 1;
					if ((s.charAt(j) == s.charAt(k)) && palindrome[j+1][k-1])
					{
						palindrome[j][k] = true;
						palindromeBeginAt = j;
						max_len = i;
					}
				}
			}
			
			return s.substring(palindromeBeginAt, max_len + palindromeBeginAt);
		}
		
		public String convertIntToString(int n)
		{
			char c;
			int i;
			String m = "";
			
			while (n > 0)
			{
				i = n % 10;
				n = n / 10;
				c = (char) ('0' + i);
				m = c + m;
			}
			
			return m;
		}
		
		
		//recurssive
		public static int factorialRecurr(int n)
		{
			if (n <=1)
				return n;
			
			return n * factorialRecurr(n-1); 
		}
		
		//iterative
		public static int factorialItr(int n)
		{
			if (n <= 1)
				return n;
			
			int a = 1;
			
			while (n > 1)
			{
				a = a * n;
				n = n - 1;
			}
			
			return a;
		}
		
		//print number of repeated chars in string
		public static String countRepeatChars(String s)
		{
			if (s == null || s.isEmpty())
				return "please enter a string";
			
			int len = s.length();
			
			if (len == 1)
				return s+"1";
			
			char[] c = s.toCharArray();
			
			String output = "";
			int charCount = 1;
			int i = 0;
			
			while (i < len-1)
			{
				while(i < len-1 && c[i] == c[i+1])
				{
					charCount++;
					i++;
				}
				
				output += String.valueOf(Character.valueOf(s.charAt(i))) + charCount;
				charCount = 1;
				i++;
			}
			
			return output;
		}
		
		
		public static int countSubStringRepeat(String s1, String s2)
		{
			if (s1==null || s2==null)
			{
				return 0;
			}
			
			if (s1.length() == 0 || s1.length() == 0)
			{
				return 0;
			}
			
			if (s1.length() == s2.length() && s1.charAt(0) != s2.charAt(0))
			{
				return 0;
			}
			
			int i = 0;
			int j = 0;
			int count = 0;
			boolean found = false;
			
			while (i < s1.length())
			{
				while (j < s2.length() && i < s1.length() && s1.charAt(i) == s2.charAt(j))
				{
					i++;
					j++;
					if (j == s2.length())
						found=true;
				}

				if (found)
					count++;
				else
					i++;
				
				j = 0;
				found=false;
			}
					
			return count;
		}
		
		//remove dupe chars in string
		public static String removeDuplicateChars(String s)
		{
			if (s == null || s.isEmpty())
				return "please enter a string";
			
			if (s.length() == 1)
				return s;
			
			boolean[] bool = new boolean[255];
			
			String output = "";
			
			for (int i = 0; i < s.length(); i++)
			{
				if (!bool[s.charAt(i)])
				{
					bool[s.charAt(i)] = true;
					output += s.charAt(i);
				}
			}
			
			return output;
		}
	}
	
	//P&C of a input String
	public static void strPnC(String s, int start, int end)
	{
		if (s.isEmpty())
			return;
		
		char[] c = s.toCharArray();
		
		if (start == end)
		{
			System.out.println(c[start]);
		}
		else
		{
			for (int i = start; i < end-1 ; i++)
			{
				char temp = c[start];
				c[start] = c[i];
				c[i] = temp;
				
				strPnC(new String(c), start+1, end);
				
				char temp1 = c[start];
				c[start] = c[i];
				c[i] = temp1;
			}
		}
	}
	
	public static String first30CharsWithoutCuttingAnyWords(String s)
	{
		String out = "";
		
		if (s == null || s.isEmpty())
			return "Please enter a string";
		
		if (s.length() <= 30)
			return s;
		else
		{
			int i = 0;
			int j = 0;
			
			while (i < s.length())
			{
				while (j < s.length() && s.charAt(j) != 32)
				{
					j++;
				}
				
				if (j <= 30)
					out += s.substring(i,j) + ' ';
				
				j++;
				i = j;
			}
			
		}
		
		return out;
	}
//	
//	"Write a function/method that takes a string and returns the char that occurred most frequently in that string."
//
//	foo("abcdee") returns 'e'
//	foo("abc   de") returns ' '
//
//	"Modify your function such that it returns the most frequently occurring letter in the string."
//
//	foo("AAAAAAeeee") returns 'a'
//	foo("AAAAAAeeeeeeeee") returns 'e'
//	foo("a         ") returns 'a'

	public char countMaxCharOcc(String s)
	{
	    if (s == null || s.length() == 0)
	    {
	         return 0;
	    }

	    int maxcount = 0;
	    char maxchar = ' ';
	    
	    int [] charcount = new int[Character.MAX_VALUE];
	    
	    for (int i=0; i < s.length(); i++)
	    {
	        char c = s.toLowerCase().charAt(i);
	       
	        if (c > 'a' && c < 'z' || c > 'A' && c < 'Z')
	        {
	            if (++charcount[c] > maxcount)
	            {
	                maxcount = charcount[c];
	                maxchar = c;
	            }
	        }
	     }
	     
	     return maxchar;
	}
	
	public static boolean areBracketsBalanced(String s)
	{
		if (s == null || s == "")
			return false;
		
		char[] charsArr = new char[]{'{','}','(',')','[',']'};
		
		theStack thestk = new theStack();
		theStack.stackArrayImplementation stk = thestk.new stackArrayImplementation(15);
		
		char[] c = s.toCharArray();
		boolean isCandidate = false;
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < charsArr.length; j++) 
			{
				if (charsArr[j] == c[i] && ((c[i] != charsArr[1]) && (c[i] != charsArr[3]) && (c[i] != charsArr[5])))
				{
					isCandidate = true;
					break;
				}
			}
			
			if(isCandidate)	
			{
				stk.push(c[i]);
				isCandidate = false;
			}
			else if (((c[i] == charsArr[1]) || (c[i] == charsArr[3]) || (c[i] == charsArr[5])))
			{
				if (!stk.isEmpty())
				{
					char openBracket = stk.peek();
					char closeBracket = c[i];
					
					int j = 0;
					
					while (j < charsArr.length) 
					{
						if (charsArr[j] == openBracket)
							break;
						else
							j++;
					}
					
					if (charsArr[j+1] == closeBracket)
					{
						stk.pop();
					}
				}
				else
					return !stk.isEmpty();
			}
		}

		return stk.isEmpty();
	}
	
	public static void inverseDeterminant(int[][] arr)
	{
			if (arr.length == 0)
				return;
			
			displayDeterminant(arr, 4, 4);
			
			int row = 0;
			int col = 0;
			int[][] out = new int[4][4];
			
			for (int i = 0; i < 4; i++) 
			{
				for (int j = 3; j >= 0; j--) 
				{
					out[row][col] = arr[i][j];
					row++;
				}
				
				col++;
				row = 0;
			}
			
			displayDeterminant(out, 4, 4);
			
	}
	
	public static void inverseDeterminantNoXtraSpace(int[][] arr)
	{
		displayDeterminant(arr, 4, 4);
		
		int i = 0;
		
		for (int j = arr.length - 1 ; j >= 0; j--) 
		{
			int index = arr.length - (j + 1);
			
			int temp1 = arr[j + (i + index) - j][index];
			arr[i][index] = arr[(j + (i + index) - j)][j];
			
			int temp2 = arr[j][index];
			arr[j][index] = temp1;
			
			int temp3 = arr[j][j];
			arr[j][j] = temp2;
			
			arr[i][j] = temp3;
			
			i++;
			displayDeterminant(arr, 4, 4);
		}

		displayDeterminant(arr, 4, 4);
	}
	
	public static void displayDeterminant(int[][] a, int rows, int coln)
	{
		System.out.print("\n");
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < coln; j++) 
			{
				System.out.print("\n" + "(row=" + i + ", col=" + j +") = " + a[i][j]);
			}
		}
	}
	
	public static int[][] prepDeterminant()
	{

		int rows = 4;
		int coln = 4;
		
		int[][] a = new int[rows][coln];
		
		for (int i = 0; i < rows; i++) 
		{
			for (int j = 0; j < coln; j++) 
			{
				
				a[i][j] = i + j;
			}
		}
		
		return a;
	}
}
