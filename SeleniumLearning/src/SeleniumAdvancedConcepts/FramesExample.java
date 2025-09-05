package SeleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {

		System.setProperty("WebDriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml;jsessionid=node01o8mknezsee8d1mmfgvegxkdmz4718786.node0");
		driver.manage().window().maximize();
		
		//1.Clicking the element inside the frame
		driver.switchTo().frame(0);
		WebElement ClickButton1= driver.findElement(By.id("Click"));
		ClickButton1.click();
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
		//2.Finding the element inside the nested frame
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement ClickButton2= driver.findElement(By.id("Click"));
		ClickButton2.click();
		driver.switchTo().defaultContent();
		
		
		//3.Find the total no of frames
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		int size=totalframes.size();
		System.out.println(size);
		
		
		
	}

}
