package com.tgt.qa.tests.csrportal.Cache;

public interface Caching 
{
	int getLatestResult(int key);
	void setResult(int key, int result);
}
