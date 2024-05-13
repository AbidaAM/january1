package testngpkg;

	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Groupingtestng {
		
		@BeforeTest(alwaysRun=true)
		public void setUp()
		{
			System.out.println("beforetest method");
		}
		@BeforeMethod(alwaysRun=true)
		public void urlloading ()
		{
			System.out.println("before method");
		}
		@Test(groups= {"smoke","sanity"})
		public void test1()
		{
			System.out.println("test1");
		}
		@Test(groups= {"smoke","sanity"})
		public void test2()
		{
			System.out.println("test2");
		}
		@Test(groups= {"smoke"})
		public void test3()
		{
			System.out.println("test3");
		}
		@Test(groups= {"regression"})
		public void test4()
		{
			System.out.println("test4");
		}
		@Test(groups= {"regression","smoke"})
		public void test5()
		{
			System.out.println("test5");
		}
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("aftermethod");
		}
		@AfterTest
		public void aftertest()
		{
			System.out.println("aftertest");
		}
		
	}
		


