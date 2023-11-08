package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.LandingPage;

public class LandingTest extends TestBase{

	LandingPage lp;
	
	public LandingTest() {
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
		lp = new LandingPage();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void navClick() throws InterruptedException {
		lp.navBarClick();
	}
	
}
