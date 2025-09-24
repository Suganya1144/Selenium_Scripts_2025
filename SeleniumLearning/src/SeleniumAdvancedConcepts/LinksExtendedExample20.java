package SeleniumAdvancedConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksExtendedExample20 {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.driver.chrome", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node0hfpwzmbwtxfg26o0fk7r8nkw6366297.node0");
	driver.manage().window().maximize();
	//1. Go to a home Page
	WebElement dashboard=driver.findElement(By.linkText("Go to Dashboard"));
	dashboard.click();
	driver.navigate().back();
	
	//2.Find without clicking
	WebElement DestElement= driver.findElement(By.partialLinkText("Find the URL"));
	String DestValue=DestElement.getAttribute("href");
	System.out.println("The link is Going to "+DestValue);
	
	//3. Verify the link is broken
	
	WebElement BrokenLink= driver.findElement(By.linkText("Broken?"));
	BrokenLink.click();
	String title=driver.getTitle();
	if(title.contains("404")) {
		System.err.println(" The Link is broken");
		driver.navigate().back();
		Thread.sleep(2000);
		
	//4. Duplicate link-  Go to Home Page interact with the same element
	WebElement Dashboard1= driver.findElement(By.linkText("Go to Dashboard"));
	Dashboard1.click();
	driver.navigate().back();
	
	//5.How many links are available in this page
	List<WebElement> TotalLinks=driver.findElements(By.tagName("a"));
	int linkcount=TotalLinks.size();
	System.out.println("Total Links" +linkcount);
	  
	
	
	}
	}

}
