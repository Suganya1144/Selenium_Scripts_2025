package seleniumBasics1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Alert has 4different types
 * 1. Normal alerts- alerts has information with okay button.
 * 2. Confirmation- Confirmation with okay and cancel button.
 * 3. Prompt- Entering a text option with okay and cancel button.
 * 4.Line Breaks- Two line information (text with line breaks) with okay button.
 * @author Suganya
 *
 */
public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//1.Alert Box
		WebElement alertBox = driver.findElement(By.id("j_idt88:j_idt91"));
		alertBox.click();
		// for handling a alert box we have to use an interface alert
		Alert alert= driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		//2. Confirmation alert - cancel action
		WebElement confirmationBox= driver.findElement(By.id("j_idt88:j_idt93"));
		confirmationBox.click();
		
		Alert confirmalert=driver.switchTo().alert();
		confirmalert.dismiss();
		
		//3.PromptBox with entering a text
		
		WebElement PromptBox= driver.findElement(By.id("j_idt88:j_idt104"));
		PromptBox.click();
		Alert PromptAlert= driver.switchTo().alert();
		PromptAlert.sendKeys("Suganya");
		PromptAlert.accept();
	}

}
