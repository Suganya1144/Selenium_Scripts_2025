package SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample22 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		driver.manage().window().maximize();
		 
		WebElement NextButton= driver.findElement
				(By.xpath("//*[@id=\'j_idt87:schedule\']/div[1]/div[1]/div/button[2]"));
		
		NextButton.click();
		//a[contains(text(),'10')]
		WebElement DateSelection = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		DateSelection.click();
		
		
	}

}
