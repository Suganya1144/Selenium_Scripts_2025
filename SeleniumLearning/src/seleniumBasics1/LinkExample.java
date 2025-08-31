package seleniumBasics1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we are telling the system we are going to use chrome as a browser and providing it's location
		System.setProperty("WebDriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");

		//Launch the chrome browser
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.leafground.com/link.xhtml");
		//driver.findElement(By.linkText("Go to Dashboard")).click();

		//partial linktext

		driver.findElement(By.partialLinkText("Dashboard")).click();

		driver.quit();


	}

}
