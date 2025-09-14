package SeleniumAdvancedConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement input= driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete_input\']"));
				//(By.xpath("//*[@id=\'j_idt87:auto-complete\']/button"));
		input.sendKeys("s");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 List<WebElement> OptionsList=driver.findElements(By.xpath("//*[@id=\'j_idt87:auto-complete_panel\']/ul/li"));
		 int listsize=OptionsList.size();
		 System.out.println(listsize);
		
		for (WebElement webElement : OptionsList) {
			if(webElement.getText().equals("Selenium WebDriver")) {
				webElement.click();
				System.out.println("If Part");
				break;
			}
				else {
					System.out.println("Else Part");
				}
			}
			
		}
	
	}


