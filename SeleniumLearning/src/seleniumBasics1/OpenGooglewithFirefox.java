package seleniumBasics1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGooglewithFirefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver","C:\\Suganya\\Selenium\\Firefoxdriver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.co.in");		
		driver.findElement(By.name("q")).sendKeys("agni"+Keys.ENTER);
		driver.quit();
	}

}
