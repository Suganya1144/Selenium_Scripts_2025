package seleniumBasics1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver= new ChromeDriver();
		//load the required URL
		driver.get("https://www.leafground.com/select.xhtml");
		
		//1. Select by index (using select class)
		WebElement Dropdown1=driver.findElement(By.className("ui-selectonemenu"));
		Select select = new Select(Dropdown1);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByVisibleText("Playwright");
		
		//2. Get the number of Options.
		List<WebElement> listofOptions=select.getOptions();
		int size=listofOptions.size();
		System.out.println("Number of Elements:"+size);
	
		//3. Select the options using sendkeys
		Dropdown1.sendKeys("Cypress");
		
	}

}
