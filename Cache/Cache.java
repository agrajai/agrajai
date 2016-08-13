package com.tgt.qa.tests.csrportal.Cache;

import java.util.Hashtable;
import org.joda.time.DateTime;

import com.tgt.qa.tests.csrportal.LinkList;
import com.tgt.qa.tests.csrportal.LinkList.Node;

public class Cache implements Caching
{
	private Hashtable<Integer, LinkList.Node> cacheHashTable = null;
	private static final int MAX_CACHE_SIZE = 10;
	private LinkList.Node front;
	private LinkList.Node tail;
	private DateTime dateTime;
	
	public Cache()
	{
		setCacheHashTable(new Hashtable<Integer, Node>());
	}

	public Hashtable<Integer, LinkList.Node> getCacheHashTable() {
		return cacheHashTable;
	}

	public void setCacheHashTable(Hashtable<Integer, LinkList.Node> cacheHashTable) {
		this.cacheHashTable = cacheHashTable;
	}

	public static int getMaxCacheSize() {
		return MAX_CACHE_SIZE;
	}

	public Node getFront() {
		return front;
	}

	public void setFront(Node front) {
		this.front = front;
	}

	public DateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}	
	
	@Override
	public int getLatestResult(int key) 
	{
		if (!getCacheHashTable().contains(key))
		{
			return -1;
		}
		
		
		Node n = new LinkList().new Node(getCacheHashTable().get(key).data);
		//get it to front
		
		return n.data ;
	}

	@Override
	public void setResult(int key, int result) 
	{
		if (getCacheHashTable().contains(key))
		{
			Node n = getCacheHashTable().get(key);
			n.data = result;
			return;
		}
		
		Node n = new LinkList().new Node(result);
		cacheHashTable.put(key, n);

	}
}
