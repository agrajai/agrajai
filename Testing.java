package com.tgt.qa.tests.csrportal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Testing
{
//	public String refInnerClass()
//	{
//		testMethods tm = new testMethods();
//		tm.palindrome("");
//		return tm.str;
//	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws Exception 
	{
//		//Rabin Karp
//		RabinKarpPatternMatchAlgo rk = new RabinKarpPatternMatchAlgo();
//		System.out.print("Pattern COUNT : " + rk.patternMatch("abcbedfabcabcabcabc", "abc"));
//		
//		
		//mvc practice
//		mvcView theView = new mvcView();
//		new mvcController(theView, new mvcModel());
//		theView.setVisible(true);
//		
//		List bicycles = new ArrayList();
//		
//		features kidsBycycle = new kidsBicycles();
//		features sportsBycycle = new sportsBicycles();
//		
//		// Run time polymorphism -- Method overriding
//		bicycles.add(kidsBycycle);
//		bicycles.add(sportsBycycle);
//		
//		for(Iterator itr = bicycles.iterator(); itr.hasNext();)
//		{
//			features f = (features) itr.next();
//			f.tyres();
//		}
//		
//		
//		// Run time polymorphism - Method overriding
//		abstractBicycle sBike = new sportsBicycles();
//		abstractBicycle kBike = new kidsBicycles();
//		abstractBicycle grandbicycles = new bicycles();
//		
//		sBike.tyres();
//		kBike.tyres();
//		//kBike.draw();
//		
//		grandbicycles.draw();
//		
//		sportsBicycles sBikes = new sportsBicycles();
//		dependencyInjection dependInj = new dependencyInjection();
//		dependInj.setBycycleType(sBikes);
//		dependInj.tyreType();
//		
//
//		
//		//Compile time polymorphism - Method overloading
//		sportsBicycles sBike1 = new sportsBicycles();
//		sBike1.tyres(10);
//		sBike1.tyres("MRF");
//		
//		
//		
//		Testing t = new Testing();
//		Testing.testMethods tm = null;//t.new testMethods();
//		System.out.print(testMethods.str);
//		
//		//Palidrome o/p
//		System.out.println(tm.palindrome("dfd"));
//		
//		//findPrime
//		System.out.println("Prime?: "+ testMethods.findPrime(31));
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
//		System.out.println("Integer to String: " + tm.convertIntToString(1234));
//		
//		System.out.println(String.format("factorial recurr:  %s", testMethods.factorialRecurr(7)));
//		System.out.println(String.format("factorial itr:  %s", testMethods.factorialItr(7)));
//		System.out.println(String.format("Remove dupe chars:  %s", testMethods.removeDuplicateChars("sshgjii")));
//		System.out.println(String.format("Repeat Chars :  %s", testMethods.countRepeatChars("aaabbccc%%")));
//		System.out.println(String.format("SubsString prescence count:  %s", testMethods.countSubStringRepeat("abcdabcdabcd", "abcd")));
//		System.out.println(String.format("Smart SubsString :  %s", testMethods.countMaxCharOcc("Feeeeaturiing")));
////		+
////				"stylish rooms and moorings for recreation boats, " +
////				"Room Mate Aitana is a designer hotel built in 2013 " +
////				"on an island in the IJ River in Amsterdam.")));
////		
////		testMethods.strPnC("1234", 0, 4);
////		
////		System.out.println("is it a balanced braces expression:? " + testMethods.areBracketsBalanced("(A+B) []{+ (F + 0)"));
////		
////		testMethods.inverseDeterminant(testMethods.prepDeterminant());
////		testMethods.inverseDeterminantNoXtraSpace((testMethods.prepDeterminant()));
////		System.out.println(String.format("Int to String:%s", testMethods.returnIntAsString(-2345)));
////		
////		int[] array = new int[]{100, 1, 0, 3, 4, 5, 6, 7, 90, 10};
////
////		System.out.println(Arrays.toString(rotateArrayByN(array, 2)));
////		findIndexofSumof2NumberinAnArray(array, 9);
////		
////		System.out.println("Match Count:? " + testMethods.subsStringPatternMatch("rajesh went to barber show barber for hair trim along with jai. Jai also met barber and had a cut.", "barber"));
////		Hashtable<String, String> h = new  Hashtable<String, String>();
////		
////		h.put("0", "Hi");
////		h.put("1", "There");
////		h.put("2", "dog");
////		h.put("3", "holla");
////		
////		System.out.println("String break: " + testMethods.stringBreakDicMatch("HiTheredogholla", h));
////		
////		testMethods.findIndexofSumof2NumberinAnArray(array, 100);
//		
//		testMethods.sortStringArrayListAnagramToEachOther(new String[] {"abc", "bcd", "nhg", "abc", "rr", "abc"});
//		
//		System.out.println(testMethods.insertFiller("http://bing.com?q1=t t ting&q2=he ll y he ", "%20"));
//		testMethods.findAnagrams();
//		testMethods.romantoInt("IV");
//		testMethods.romantoInt("V");
//		testMethods.romantoInt("VI");
//		testMethods.romantoInt("IXV");
//		testMethods.romantoInt("XV");
//		testMethods.romantoInt("DCX");
//		testMethods.romantoInt("ABC");
		
//		testMethods.substringCheck();
		System.out.println(testMethods.findLoser(new String[] {"man","hen","pen","sen","len"}, 2));
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
		public boolean palindrome(String s)
		{
			if (s == null || s.length() == 0)
				return false;
			
			if (s.length() == 1)
				return true;
			
			int j = s.length() - 1;
			char[] c = s.toCharArray();
			
			for (int i=0; i < j; i++, j--) 
			{
				if (c[i] != c[j])
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
			
			for (int i = 2; Math.pow(i, 2) < n; i++) 
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
		
		
		public static int returnStringAsInt(String str)
		{
			int i = 0;
			int num = 0;
			
			while (i < str.length())
			{
				num *= 10;
				num += str.charAt(i++) - '0';
			}
			
			return num;
		}
		
		public String fetchExcelColName(int col)
		{
			String excelCol = "";
			
			col = col - 1;
			
			while (col >= 0)
			{
				int mod = (col % 26);
				excelCol = String.valueOf(Character.toChars(mod + 'A')) + excelCol;
				col = (col/26) - 1 ;
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
					{
						found=true;
					}
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

		
		public static int subsStringPatternMatch(String s, String sub)
		{
			if ((s == null || s.isEmpty()) && (sub == null || sub.length() == 0))
			{
				return 0;
			}
			
			int i = 0;
			int end = 0;
			int offset = 0;
			int patternLen = sub.length() - 1;
			int count = 0;
			boolean match = false;
			boolean noMatchSoFar = false;
			
			while (end + offset < (s.length() - sub.length()))
			{
				end += offset;
				
				i = patternLen;
				while (patternLen >= 0)
				{
					char mainStr = s.charAt(end + i);
					char patternStr = sub.charAt(patternLen);
					
					if (mainStr == patternStr)
					{
						if (!noMatchSoFar)
						{
							match = true;
							i--;
						}
						else
						{
							break;
						}
					}
					else
					{
						if (!match)
							noMatchSoFar = true;
						else
							break;
					}
					
					if (patternLen != 0)
						patternLen--;
					
					if (patternLen == 0)
						break;
				}
				
				if (match && patternLen == 0) //case of 100% match
				{
					count++;
					offset = sub.length() - 1;
				}
				else if (!match && patternLen == 0)//no match at all
				{
					offset = sub.length() - 1;
				}
				else //1st match
				{
					offset = (sub.length() - 1) - patternLen;
				}
				
				//reset variables
				patternLen = sub.length() - 1; //reset patternLen
				match = false;
				noMatchSoFar = false;
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
				
				strPnC(new String(c), start + 1, end);
				
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
				else
					break;
				
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

	public static char countMaxCharOcc(String s)
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
					char openBracket = (char) stk.peek();
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
	
	public static int[] rotateArrayByN(int[] array, int n) 
	{
		int rotation = n > array.length ? n % array.length : n;

		for (int i = array.length-rotation-1; i >-1; i--) 
		{
			int newPosition = i + rotation >= array.length ? i + rotation - array.length : i + rotation;
			int oldValue = array[newPosition];
			array[newPosition] = array[i];
			array[i] = oldValue;
		}
		return array;
		
		
		//reverse array by (arr, 0, n-1)
		//reverse array by (arr, 0, k-1)
		//reverse array by (arr, k, n-1)
	}
	
	public static void findIndexofSumof2NumberinAnArray(int[] a, int sum)
	{
		//Store array into an hashtable
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		for (int i = 0; i < a.length; i++)
		{
			h.put(a[i], i);
		}
		
		//Use storage to find Sum - number and pull the index
		for (int i = 0; i < a.length; i++) 
		{
			if (h.contains(sum - a[i]))
				System.out.println(String.format("Indexes: %s and %s of sum of value %s+%s", i, a[i], sum - a[i], h.get(sum - a[i])));
		}
	}
	
	public static String stringBreakDicMatch(String input, Hashtable h)
	{
		if (h.contains(input))
		{
			return input;
		}
		
		for (int i = 1; i < input.length(); i++) 
		{
			String prefix = input.substring(0, i);
			
			if (h.contains(prefix))
			{
				String suffix = input.substring(i, input.length());
				String remaining = stringBreakDicMatch(suffix, h);
				
				if (remaining != null)
				{
					return prefix + ',' + remaining;
				}
			}
		}
		
		return null;
	}
	
	
	@SuppressWarnings("null")
	public static void sortStringArrayListAnagramToEachOther(String[] s)
	{
		if (s == null || s.length == 0)
		{
			return;
		}
		
		//Use Merge Sort and compare the string array elements to each other whether they are <, >, =(anagram)
		
		int mid = (s.length) /2;
		String[] left = new String[mid];
		String[] right = new String[s.length - mid];
		
		for (int i = 0; i < mid; i++) 
		{
			left[i] = s[i];
		}
		
		for (int i = 0; i < s.length - mid; i++) 
		{
			right[i] = s[mid + i];
		}
		
		sortStringArrayListAnagramToEachOther(left);
		sortStringArrayListAnagramToEachOther(right);
		
		merge(left, right, s);
	}
	
	private static void merge(String[] a, String[] b, String[] out)
	{
		int i = 0, j = 0, k = 0;
		
		while (i < a.length && j < b.length)
		{
			if (isAnagram(a[i], b[j]).equals("anagram"))
			{
				out[k] = a[i++];
				out[k] = b[j++];
			}
			else if (isAnagram(a[i], b[j]).equals("less"))
			{
				out[k] = a[i++];
			}
			else
			{
				out[k] = b[j++];
			}
			
			k++;
		}
		
		for (int k2 = 0; k2 < out.length; k2++) {
			
			System.out.print(out[k2]);
			
		}
	}
	
	private static String isAnagram(String a, String b)
	{
		if (a.length() == 0 || b. length() == 0)
		{
			return "empty";
		}
		
		int a1 = 0;
		int b1 = 0;
		
		for (int i = 0; i < a.length(); i++) 
		{
			a1 += a.charAt(i);			
		}
			
		for (int i = 0; i < b.length(); i++) 
		{
			b1 += b.charAt(i);			
		}
		
		if (a1 == b1)
			return "anagram";
		else if (a1 < b1)
			return "less";
		else
			return "more";
	}
	
	public String reverse(String input)
	{
	    if (input == null || input.length() == 0)
	    {
	        return "Please provide a String";
	    }
	    
	    String[] strArray = input.split(" ");
	    String out = "";
	    
	    for (int i = strArray.length - 1; i > 0; i--)
	    {
	        out += strArray[i] + ' ';
	    }
	    
	    return out;
	}
	
	public static String insertFiller(String input, String filler)
	{
		if (input == null ||input.length() == 0)
		{
			return "String input";
		}
		
		if (filler == null || filler.length() == 0)
		{
			return "String filler";
		}
		
		char[] c = input.toCharArray();
		
		//find number of white spaces
		int i = 0;
		int count = 0;
		while (i < c.length)
		{
			if (c[i] == 32)
			{
				count++;
			}
			
			i++;
		}
		
		int j = 0;
		int n = 0;
		char[] out = new char[input.length() + count *2];
		
		while (j < c.length)
		{
			if(c[j] == 32)
			{
				out[n++] = '%';
				out[n++] = '2';
				out[n++] = '0';
			}
			else
			{
				out[n++] = c[j];
			}
			
			j++;
		}
		
		return new String(out, 0, out.length);
	}
	
	
	public static List<List<String>> findAnagrams()
	{
		String[] strs = {"cat", "dog", "tac", "god", "act","mary","Mary","army"};
		
	    List<List<String>> result = new ArrayList<List<String>>();
	    
	    HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
	    
	    for(String str: strs)
	    {
	        char[] arr = str.toCharArray();
	        
	        Arrays.sort(arr);
	        
	        String ns = new String(arr);
	 
	        if(map.containsKey(ns))
	        {
	            map.get(ns).add(str);
	        }
	        else
	        {
	            ArrayList<String> al = new ArrayList<String>();
	            al.add(str);
	            map.put(ns, al);
	        }
	    }
	 
	    for(Map.Entry<String, ArrayList<String>> entry: map.entrySet())
	    {
	        Collections.sort(entry.getValue());
	    }
	 
	    result.addAll(map.values());
	 
	    return result;
	}
	
	private static int getASCIISum(String s)
	{
		int sum = 0;
		for (int i=0; i < s.length(); i++)
		{
			sum += s.charAt(i);
		}
		
		return sum;
	}
	
	public static void romantoInt(String s)
	{
		if (s == null || s.length() == 0)
			return;
		
		Hashtable<Character, Integer> ht = getRomanInt();
		int out = ht.get(s.charAt(s.length() - 1));
		
		for (int i = 0; i < s.length() - 1; i++) 
		{
			char c = s.charAt(i);
			if (ht.containsKey(c))
			{
				if (ht.get(s.charAt(i)) < ht.get(s.charAt(i+1)))
				{
					out -= ht.get(c);
				}
				else
				{
					out += ht.get(c);
				}
			}
			else
			{
				System.out.println("Wrong input: " + s);
				break;
			}
		}
		
		System.out.println(String.format("Roman to Int %s : %s",s, out));
	}
	
	private static Hashtable<Character, Integer> getRomanInt()
	{
		Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
		h.put('I',1);
		h.put('V',5);
		h.put('X',10);
		h.put('L',50);
		h.put('C',100);
		h.put('D',500);
		h.put('M',1000);
		
		return h;
	}
	
	public static void substringCheck()
	{
		String text = "jaivardhanagarwal";
		String sub = "waljaivardhanagar";
	
		int i=0;
		int j=0;
		
		String concat = sub + sub;
		
		while (i < concat.length())
		{
			if (text.charAt(j) == concat.charAt(i))
			{
				System.out.print(String.format("text=:%s j=:%s  ", text.charAt(j), j));
				System.out.println(String.format("concat=:%s i=:%s", concat.charAt(i), i));
				
				if (j < text.length() - 1)
					j++;
				else
					break;
			}
			else
			{
				j = 0;
			}
			
			i++;
		}
		
		if (j == text.length() - 1)
		{
			System.out.println(i - (text.length() - 1));
			String str = concat.substring(i - (text.length() - 1), i + 1);
			System.out.println("str :" + str);
			System.out.println("Substring Match?:" + text.equals(str));
		}
	}
	
//	Starting: A B C D E; n=2
//			1st: A x C D E
//			2nd: A x C x E
//			3rd: x x C x E
//			4th: x x C x x
//			Result: C
//
//			A B C D E
//			A B x D E = count = 4; n = 3
//			x B x D E = i reset
//			x B x D x
//			x x x D x
//"man","hen","pen","sen","len"
//"man", x, "pen","sen","len"
//"man", x, "pen", x, "len"
//x, x, "pen", x, "len"
//x, x, "pen", x, x


	public static boolean findLoser(String[] names, int n) throws Exception 
	{
//	    if (names.length == 0)
//	        throw new Exception("Please enter names");
//	        
//	    if (n <= 0)
//	        throw new Exception("Please enter +ve number");
//	        
//	    ArrayList<String> al = new ArrayList<String>();
//	       
//	    
//	    for(int i = 0; i < names.length; i++)
//	    {
//	        al.add(names[i]);
//	    }
//	    
//	    int i = 0;
//	    int count = al.size();
//	    
//	    while (count > 1)
//	    {
//	        i = i + (n-1);
//	        
//	        if (i % n == 0)
//	        {
//	            al.remove(i - 1);
//	        }
//	        
//	        count = al.size();
//	        
//	        if (i > count)
//	            i = i % count;
//	    }
//	    
//	    return al.get(0);
		
		
		Boolean f = null;
		if (f)
			return f;
		return f;
	}
	
	public void longestValidSubString(String s)
	{
		
	}
}
