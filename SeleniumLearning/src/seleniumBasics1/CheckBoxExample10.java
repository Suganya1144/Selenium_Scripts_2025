package seleniumBasics1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxExample10 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Suganya\\Selenium\\NewChrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0137hw9cu0fhdv1l0am5ygya69q4327520.node0");
		//1. Select the check box
		WebElement BasicCheckbox= driver.findElement(By.
				xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
		BasicCheckbox.click();
		
		//2. check the check box is selected
	    WebElement Notification =driver.findElement(By.xpath
	    		("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[2]/div/div/div/div[2]"));
		Notification.click();
		boolean status=Notification.isSelected();
		//after click action also status is available as false
				System.out.println(status);
		//3. Unselect a selected check box
		

	}

}
