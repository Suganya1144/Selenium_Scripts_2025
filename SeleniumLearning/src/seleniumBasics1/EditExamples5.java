package seleniumBasics1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * In text box perform the following
 *  1. Enter your name.
 *  2. Append a text and press a keyboard tab.
 *  3. Get default text entered
 *  4. clear the text
 *  5. Confirm that edit field is disabled
 * @author Suganya
 *
 */
public class EditExamples5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/input.xhtml;jsessionid=node01gckxb0k9dqus31q3p9iypa2r3961388.node0");
		//1. Enter your name.
		WebElement name = driver.findElement(By.id("j_idt88:name"));
		name.sendKeys("Babu Manickam");
		//2. Append country to this city
		WebElement appendBox = driver.findElement(By.id("j_idt88:j_idt91"));
		appendBox.sendKeys(" India");
		//3.Retrieve the typed text.
		WebElement RetrieveBox = driver.findElement(By.name("j_idt88:j_idt97"));
		String RText= RetrieveBox.getAttribute("value");
		System.out.println(RText);
		//4. Clear the typed text
		WebElement ClearBox= driver.findElement(By.id("j_idt88:j_idt95"));
		ClearBox.clear();
		//5.Verify the text box is disabled
		WebElement diabledBox = driver.findElement(By.name("j_idt88:j_idt93"));
		Boolean disabledvalue=diabledBox.isEnabled();
		System.out.println(disabledvalue);


	}

}
