package com.tgt.qa.tests.csrportal;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class CollectionDataStructures 
{
	Hashtable<String, Integer> hashTable = null;
	Map<String, Integer> hashMap = null;	
	Set<String> hashSet = null;
	
	HashSet<String> set = new HashSet<String>();

	public CollectionDataStructures()
	{
		hashTable = new Hashtable<String, Integer>();
		hashMap = new HashMap<String, Integer>();	
		hashSet = new HashSet<String>();
		
		setHashTable();
		setHashMap();
		setSet();
	}
	
	public void setHashTable()
	{
		hashTable.put("HT", 0);
		//hashTable.put(null, null);
		hashTable.put("HT1", 1);
		hashTable.put("HT1", hashTable.get("HT1") + 100);
		hashTable.put("HT2", 2);
		hashTable.put("HT3", 3);
		hashTable.put("HT4", 4);
		Collections.unmodifiableMap(hashTable);
	}
	
	public void setHashMap()
	{
		hashMap.put("HM", 0);
		hashMap.put("HM", 1);
		hashMap.put(null, null);
		hashMap.put("HM1", 1);
		hashMap.put("HM2", 2);
		hashMap.put("HM3", 3);
		hashMap.put("HM4", 4);
		Collections.unmodifiableMap(hashMap);
	}
	
	public void setSet()
	{
		hashSet.add("HS");
		hashSet.add(null);
		hashSet.add("HS");
		hashSet.add("HS1");
		hashSet.add("HS2");
		hashSet.add("HS3");
		hashSet.add("HS4");
		Collections.unmodifiableSet(hashSet);
	}
}
