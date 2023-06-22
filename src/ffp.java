import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ffp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");  
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("oneplus nord ce 2 lite 5g");
		driver.findElement(By.xpath(".//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath(".//span[contains(text(),'OnePlus Nord CE 2 Lite 5G (Black Dusk, 6GB RAM, 128GB Storage)')]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 String ref = driver.getWindowHandle();
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
		Thread.sleep(30000);
		driver.findElement(By.xpath(".//input[@id='add-to-cart-button']")).click();
		//driver.findElement(By.xpath(".//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath(".//button[contains(.,'Add to cart')]")).click();
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		//WebElement add = driver.findElement(By.xpath("(.//button[@class='_2KpZ6l _2U9uOA _3v1-ww'])[1]"));
//		//js.executeScript("arguments[0].click()", add);
//	//	WebElement tgt = driver.findElement(By.xpath("(.//*[local-name()='svg'])[@class='_1KOMV2']"));
//		//Actions a=new Actions(driver);
//		//a.moveToElement(tgt).perform();
//		//a.contextClick().perform();
//		
//		 //js.executeScript("document.getElementsByTagName(\"svg\")[15]");
//		 
//		WebElement buy = driver.findElement(By.xpath(".//button[contains(.,'Buy Now')]"));
//		Thread.sleep(10000);
//		js.executeScript("arguments[0].submit()", buy);
//		//js.executeScript("do, args)
		
	}

}
