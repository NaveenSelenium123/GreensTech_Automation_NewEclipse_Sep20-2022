package org.com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Simple {
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class........");

	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class..............");

	}
	@BeforeMethod
	public void beforeEachMethod() {
		System.out.println("Before Each Method");
	}
	@AfterMethod
	public void afterEachMethod() {
		System.out.println("After Each Method");

	}
	
@Test
public void tc1() {

}

}
