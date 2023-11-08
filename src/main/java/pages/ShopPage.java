package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class ShopPage extends TestBase{

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	Actions action = new Actions(driver);
	
	public ShopPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Shop All Products")
	WebElement shopAllProducts;
	
	@FindBy(xpath="//li[@class='oddit-featured-products__item'][1]//a")
	WebElement productOne;
	
	/*@FindBy(id="ajax_cart")
	WebElement addToCartButton;*/
	
	@FindBy(xpath="//form[@class='main_form']//a")
	WebElement addToCartButton;
	
	public void addProduct() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(540, 1664)","");
		System.out.println(shopAllProducts.getLocation());
		
		wait.until(ExpectedConditions.visibilityOf(shopAllProducts));
		action.moveToElement(shopAllProducts).click().perform();
		Thread.sleep(2000);
		driver.navigate().back();
	
		
		Thread.sleep(2000);
		System.out.println(productOne.getLocation());
		
		js.executeScript("window.scrollBy(30, 1140)","");
		wait.until(ExpectedConditions.visibilityOf(productOne));
		productOne.click();
		
		Thread.sleep(2000);
		System.out.println(addToCartButton.getLocation());
		addToCartButton.click();
	}
	


}
