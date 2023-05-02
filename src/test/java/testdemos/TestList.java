package testdemos;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({TestListen.class})
public class TestList {
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(retryAnalyzer = RetryAn.class)
	public void test2() {
		Assert.assertFalse(true);
	}
	
	@Test(dependsOnMethods = {"test2"})
	public void test3() {
		
		System.out.println("Test 3");
		
	}

}
