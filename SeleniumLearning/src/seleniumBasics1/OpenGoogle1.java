package seleniumBasics1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Open Chrome
		//2. Google home page

		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\www.google.com");
		//driver.quit();

	}

}
