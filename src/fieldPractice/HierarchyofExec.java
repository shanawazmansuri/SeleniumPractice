package fieldPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HierarchyofExec {
	
	@Test
	public void TestCase1()
	{
		System.out.println("This is Test Case 1");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("This will execute before every Method");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("This will execute after every Method");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("This will execute before the Class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("This will execute after the Class");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("This will execute before the Test");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("This will execute after the Test");
	}
	
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("This will execute before the Test Suite");
	}
	

	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("This will execute after the Test Suite");
	}
}
