package com.onlineshoppingtestscript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.onlineshoppingpomclass.AppleIphone;
import com.onlineshoppingpomclass.BuyProduct;
import com.onlineshoppingpomclass.OnlineShopping;
import com.onlineshoppingpomclass.ShoppingCart;


public class OnlineShoppingTestScript {
	
	WebDriver driver;
	
	@BeforeTest
	public void openApp() {
		driver =new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@Test
	public void allmethods() throws InterruptedException {
		BuyProduct rv2=new BuyProduct(driver);
		AppleIphone rv1=new AppleIphone(driver);
		ShoppingCart rv=new ShoppingCart(driver);
		rv2.clickOnCancel();
		rv2.setShoppingProduct("iphone mobile");
		rv2.clickOnSearch();
		rv2.selectRam();
		Thread.sleep(5000);
		rv2.selectProduct();
		
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
		Thread.sleep(30000);
		rv1.clickOnAddToCart();
		
		Thread.sleep(5000);
		rv.clickOnPlaceOrder();
	}

}
