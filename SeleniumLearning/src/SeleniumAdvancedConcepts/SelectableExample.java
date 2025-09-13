package SeleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selectable.php");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		
		List<WebElement> Selectable=driver.findElements(By.xpath("//*[@id=\'nav-home\']/ul/li"));
		int ListSize=Selectable.size();
		System.out.println(ListSize);
		Thread.sleep(1000);
//		Actions action1= new Actions(driver);
//		action1.keyDown(Keys.CONTROL)
//		.click(Selectable.get(0))
//		.click(Selectable.get(1)).build().perform();
		
		Actions action2 = new Actions(driver);
		action2.click(Selectable.get(0));
		action2.click(Selectable.get(1));
		action2.click(Selectable.get(2));

		action2.build().perform();

	}

}
