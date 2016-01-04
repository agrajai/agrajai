package com.tgt.qa.tests.csrportal;

public class SearchAndSorting 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		SearchAndSorting sns = new SearchAndSorting();
		SearchAndSorting.Search search = sns.new Search();
		
		System.out.println(search.binarySearchItr(new int[] {1,2,3,4,5,6,7,8,9,10}, 10));
		System.out.println(search.binarySearchRecurrsive(new int[] {1,2,3,4,5,6,7,8,9,10}, 10, 0, 9));

	}
	
	
	public class Search
	{
		public int binarySearchItr(int[] arr, int d)
		{
			if (arr.length == 0)
				return -1;
			
			int low = 0;
			int high = arr.length -1;
			int mid = 0;
			
			while (low <= high)
			{
				mid = (low + high)/2;
				
				if (d > arr[mid])
					low = mid + 1;
				else if (d < arr[mid])
					high = mid -1;
				else
					return arr[mid];
			}
			
			return -1;
		}
		
		public int binarySearchRecurrsive(int[] arr , int d, int low, int high)
		{
			if (arr.length == 0)
				return -1;
			
			int mid = (low + high)/2;
			

			if (d > arr[mid])
				return binarySearchRecurrsive(arr, d, mid + 1, high);
			else if (d < arr[mid])
				return binarySearchRecurrsive(arr, d, low, mid - 1);
			
			return arr[mid];

		}
	}

}
