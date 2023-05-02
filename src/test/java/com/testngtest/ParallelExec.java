package com.testngtest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExec {
	
	
	@Test()
	public void test1()
	{
		System.out.println("Test 1 executed"+Thread.currentThread().getId());
	}
	
	
	@Test()
	public void test2()
	{
		System.out.println("Test 2 executed"+Thread.currentThread().getId());	
		
	}
	
	@Test()
	public void test3()
	{
		System.out.println("Test 3 executed"+Thread.currentThread().getId());
	}


}
