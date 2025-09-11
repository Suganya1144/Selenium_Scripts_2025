package SeleniumAdvancedConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImageExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/broken");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		WebElement BrokenIamge= driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div/div[2]/div[2]/img[2]"));
		if(BrokenIamge.getAttribute("naturalWidth").equals("0")){
			System.out.println("The image is broken");
		}
			else {
				System.out.println("The image is not broken");
			}
				
				
			}
		}
