package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;

public class LandingPage extends TestBase{
	
	Actions action = new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Best Sellers")
	WebElement NavBestSeller;
	
	@FindBy(linkText="Sets")
	WebElement NavSets;
	
	@FindBy(linkText="Subscribe & Save")
	WebElement NavSubNSave;
	
	@FindBy(xpath="//li[@class='oddit-menu-desktop__item']//button")
	WebElement More;
	
	@FindBy(linkText="Shop all")
	WebElement NavShopAll;
	
	@FindBy(linkText="Shop All Products")
	WebElement ShopAllProd;
	
	
	public void navBarClick() throws InterruptedException {
		NavBestSeller.click();
		
		driver.navigate().back();
		
		wait.until(ExpectedConditions.visibilityOf(NavSets));
		
		NavSets.click();
		
		driver.navigate().back();
		
		wait.until(ExpectedConditions.visibilityOf(NavSubNSave));
		
		NavSubNSave.click();
		
		More.click();
		//action.moveToElement(More);
		
		Thread.sleep(3000);
		
		List<WebElement> moreList = driver.findElements(By.xpath("//li[@class='oddit-menu-desktop__item']//button"));
		
		for(WebElement i : moreList) {
			System.out.println(i.getText());
		}
		
		NavShopAll.click();
		
		Thread.sleep(2000);
	}

}
