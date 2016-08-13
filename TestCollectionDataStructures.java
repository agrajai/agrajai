package com.tgt.qa.tests.csrportal;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestCollectionDataStructures 
{
	static CollectionDataStructures cds = new CollectionDataStructures();
	
	public static void main(String[] args)
	{
		printHashTable();
		printHashMap();
		printSets();
	}
	
	public static void printHashTable()
	{
		Enumeration<String> enumKey = cds.hashTable.keys();
		Iterator<?> itr = cds.hashTable.keySet().iterator();
		
//		for(Integer s : cds.hashTable.values())
//		{
//		
//		}
		
		while (itr.hasNext())
		{
			//cds.hashTable.put("MOD", 78);
			String key = itr.next().toString();
			System.out.println(String.format("Key: %s; Value: %s", key, cds.hashTable.get(key)));
		}
		while(enumKey.hasMoreElements())
		{
			String key = enumKey.nextElement();
			System.out.println(String.format("Key: %s; Value: %s", key, cds.hashTable.get(key)));
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void printHashMap()
	{
		Iterator<?> itr = cds.hashMap.entrySet().iterator();
		
		while(itr.hasNext())
		{
			//cds.hashMap.put("Modify", 58);
			Map.Entry key = (Entry) itr.next();
			System.out.println(String.format("Key: %s; Value: %s", cds.hashMap.containsKey(key.getKey()), key.getKey(), key.getValue()));
		}
	}
	
	public static void printSets()
	{
		Iterator<?> itr = cds.hashSet.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(String.format("Value: %s", itr.next()));
		}
	}
}
