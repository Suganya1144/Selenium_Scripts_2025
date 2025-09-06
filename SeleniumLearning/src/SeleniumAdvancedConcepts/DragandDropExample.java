package SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		
		WebElement From=driver.findElement(By.id("form:drag_content"));
		WebElement To=driver.findElement(By.id("form:drop_content"));
		
		Actions action= new Actions(driver);
		Thread.sleep(2000);
		//action.clickAndHold(From).moveToElement(To).release().build().perform();
		action.dragAndDrop(From, To).build().perform();

		
	}

}
