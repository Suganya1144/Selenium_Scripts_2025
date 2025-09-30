package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long StartTime;
	long EndTime;

	//Aim : Open a chrome browser and go to 
	// 1. google.co.in 2.bing.com 3. Yahoo.com & then close the browser\

	@BeforeSuite
	public void launchtheBrowser() {
		
		 StartTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void OpenGoogle() {
		driver.get("http://www.google.co.in");
	}
	@Test
	public void OpenBing() {
		driver.get("http://www.bing.com");

	}
	@Test
	public void OpenYahoo() {
		driver.get("http://www.leafground.com");
	}
	@AfterSuite
	public void CloseBrowser() {
		
		driver.quit();
		EndTime= System.currentTimeMillis();
		long TotalTime= EndTime-StartTime;
		System.out.println("Total Time Taken"+TotalTime);
		}

}
