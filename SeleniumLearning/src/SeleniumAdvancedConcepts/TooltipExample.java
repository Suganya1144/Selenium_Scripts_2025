package SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TooltipExample {

	public static void main(String[] args) {
	 System.setProperty("WebDriver.chrome.driver","C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.leafground.com/dashboard.xhtml");
	 driver.manage().window().maximize();
	 WebElement email=driver.findElement(By.id("email"));
	 String tooltipText=email.getAttribute("placeholder");
	 System.out.println(tooltipText);
	}

}
