package seleniumBasics1;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node0mf8tjwjkclmo2h8ig9xu3gcx4178872.node0");
		//1. Find the default selected one

		WebElement Unchecked1= driver.findElement(By.
				xpath("//*[@id=\'j_idt87:console2:0\']")); 
		//Unchecked1.click();
		//Thread.sleep(2000);
		//Unchecked1.isSelected();

		WebElement Unchecked2=driver.findElement(By.id("j_idt87:console2:1")); 
		//Unchecked2.click();
		//Thread.sleep(2000);
		
		WebElement Checked=driver.findElement(By.
				id("j_idt87:console2:2")); 
		//Checked.click();
		WebElement Unchecked3=driver.findElement(By.
				id("j_idt87:console2:3")); 

		Boolean Status1=Unchecked1.isSelected(); 
		Boolean Status2=Unchecked2.isSelected();
		Boolean Status3=Checked.isSelected(); 
		Boolean Status4=Unchecked3.isSelected();
		System.out.println(Status1); 
		System.out.println(Status2);
		System.out.println(Status3); System.out.println(Status4);

		//2. Click the Radio button
		
		WebElement favorite= driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/label"));
		favorite.click();
		Thread.sleep(3000);

		driver.quit();

	}

}
