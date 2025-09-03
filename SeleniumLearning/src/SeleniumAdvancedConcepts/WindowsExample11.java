package SeleniumAdvancedConcepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.driver.chrome", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml;jsessionid=node0semejdsg03bgre5la920kapl4525993.node0");
		driver.manage().window().maximize();
		
		//1.Click button to open home page in new window
		WebElement Openbutton= driver.findElement(By.xpath("//*[@id=\'j_idt88:new\']/span"));
		Openbutton.click();
		
		String oldWindow= driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String newWindow : handles){
			driver.switchTo().window(newWindow);			
		}
		WebElement DailycheckBox= driver.findElement(By.xpath("//*[@id=\'j_idt107\']/div[2]"));
		DailycheckBox.click();
		driver.close();
		driver.switchTo().window(oldWindow);
		
		//2.Find the number of opened window
		WebElement OpenMultipleButton= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
		OpenMultipleButton.click();
		int Numberofopenedwindows=driver.getWindowHandles().size();
		System.out.println("No of opened windows is:"+Numberofopenedwindows);
		//driver.quit();
		
		//3.Close all except the primary
		WebElement closeButton= driver.findElement(By.
				xpath("//*[@id=\'j_idt88:j_idt93\']/span[2]"));
		closeButton.click();
		Set<String> newWindowHandles=driver.getWindowHandles();
		for(String allwindows: newWindowHandles) {
			if(!allwindows.equals(oldWindow)) {
				driver.switchTo().window(allwindows);
				driver.close();
				
			}
			driver.quit();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
