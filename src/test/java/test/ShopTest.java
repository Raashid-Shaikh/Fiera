package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.ShopPage;

public class ShopTest extends TestBase{
	
	ShopPage sp;
	
	public ShopTest() {
		super();
	}
	
	
	@BeforeMethod()
	public void setUp() {
		initialization();
		sp = new ShopPage();
	}
	
	@AfterMethod()
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void AddProduct() throws InterruptedException {
		sp.addProduct();
	}

}
