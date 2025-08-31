package seleniumBasics1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Suganya\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node01y0lro9qz1tvhljvehxw24imk3993635.node0");
		//1. Get position
		WebElement ButtonPosition=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt94\']/span[2]"));
		Point xypoints= ButtonPosition.getLocation();
		int xvalue=xypoints.getX();
		int yvalue=xypoints.getY();
		System.out.println("X value is" + xvalue+ "Y value is" + yvalue);

		//2.Find the button color
		WebElement ButtonColor=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt96\']/span[2]"));
		String color=ButtonColor.getCssValue("Color");
		System.out.println("Backgroud color is"+color);
		
		//3.Find the Button Size (Find the height and width of this button)
		WebElement SizeButton= driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
		int height=SizeButton.getSize().getHeight();
		int Width=SizeButton.getSize().getWidth();
		System.out.println("Height is"+height+ "Width is"+Width);
		//4.go to home

		WebElement ClickButton=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt90\']/span"));
		ClickButton.click();
	}

}
