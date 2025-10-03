package SeleniumAdvancedConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample23 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/sortable");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.sendKeys(Keys.ARROW_DOWN);
		actions.perform();
		List<WebElement> sortable=driver.findElements(By.xpath("//*[@id=\'demo-tabpane-list\']/div/div"));
		int size=sortable.size();
		System.out.println(size);
		WebElement fromElement=sortable.get(5);
		WebElement toElement=sortable.get(1);
		Actions actions1=new Actions(driver);
		actions1.dragAndDrop(toElement,fromElement);
		actions1.build().perform();
		//driver.quit();
	}

}
