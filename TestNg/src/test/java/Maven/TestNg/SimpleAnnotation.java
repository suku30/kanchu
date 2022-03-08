package Maven.TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
	@BeforeSuite
	private void test() {
		System.out.println("Before Suite");

	}
	@BeforeTest
	private void test1() {
		System.out.println("Before Test");

	}
	@BeforeClass
	private void test2() {
		System.out.println("Before Class");

	}
	@BeforeMethod
	private void test3() {
		System.out.println("Before Method");

	}
	@Test
	private void test4() {
		System.out.println("Test");

	}
	@Test
	private void test5() {
		System.out.println("Test1");

	}
	@Test
	private void test6() {
		System.out.println("Test2");

	}
	@AfterMethod
	private void test7() {
		System.out.println("After Method");

	}
	@AfterClass
	private void test8() {
		System.out.println("After Class");

	}
	@AfterTest
	private void test9() {
		System.out.println("After Test");

	}
	@AfterSuite
	private void void10() {
		System.out.println("After Suit");

	}

}
