package SeleniumAdvancedConcepts;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
		//1. Click the download button
		
		WebElement DownloadButton= driver.findElement(By.id("j_idt93:j_idt95"));
		DownloadButton.click();
		
		//2. Check the file is downloaded
		
		File filename= new File("C:\\Users\\Suganya.LAPTOP-0TD01EN7\\Downloads");
		 File[] totalfiles=filename.listFiles();
		 for (File file : totalfiles) {
			 if(file.getName().equals("TestLeaf Logo.png")) {
				 System.out.println("File is Downloaded");
				 break;
			 }
			 else 
			 {
				 System.out.println("Else part");
			 }
			
		}
		
		
	}

}
