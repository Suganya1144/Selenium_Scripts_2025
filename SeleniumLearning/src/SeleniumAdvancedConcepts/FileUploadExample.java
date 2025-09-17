package SeleniumAdvancedConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FileUploadExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("driver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/file.xhtml;jsessionid=node01bg2nr3mqbmlugywor9xcbkac5942386.node0");

		// 1.Click on the upload button
		WebElement basicuploadButton=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt89\']/span[1]"));
		basicuploadButton.click();

		//2.Providing a file location in the window (from here windows control begins)
		String file="C:\\Users\\Suganya.LAPTOP-0TD01EN7\\Downloads\\TestLeaf.png";
		//3. String selection class is to convert string to a text
		StringSelection selection= new StringSelection(file);

		//4. setting a clip board content as file  

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(2000);

		//5. Using Robot class pasting a file location in window 

		Robot robot= new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
