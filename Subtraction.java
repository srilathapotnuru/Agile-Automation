package Web_Calc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subtraction
{

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chromedriver", 
				"C:\\Users\\user\\Desktop\\Executable files\\Drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@ class = 'gLFyf']")).sendKeys("Web Calculator");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement ele1 = driver.findElement(By.xpath("//div[@class = 'PaQdxb A2W7l']//div[@jsname = 'T7PMFe']"));
		boolean num_8 = ele1.isEnabled();
		if (num_8)
		{
			System.out.println("Selected number key-8 is enabled");
		}
		else
		{
			throw new RuntimeException("It is disabled");
		}
		ele1.click();
		WebElement ele2 = driver.findElement(By.xpath("//div[@class = 'PaQdxb mF5fo']//div[@jsname = 'pPHzQc']"));
		ele2.click();
		WebElement ele3 = driver.findElement(By.xpath("//div[@class = 'PaQdxb A2W7l']//div[@jsname = 'rk7bOd']"));
		boolean num_7 = ele3.isEnabled();
		if (num_7)
		{
			System.out.println("Selected number key-7 is enabled");
		}
		else
		{
			throw new RuntimeException("It is disabled");
		}
		ele3.click();
		WebElement ele4 = driver.findElement(By.xpath("//div[@class = 'PaQdxb mF5fo G7BHUb']//div[@jsname = 'Pt8tGc']"));
		ele4.click(); 
		String result = driver.findElement(By.xpath("//div[@class = 'z7BZJb XSNERd']//span[@jsname = 'VssY5c']")).getText();
		System.out.println("Subtraction of the above numbers 8 and 7 is " + result);
		if (result=="1")
		{
			System.out.println("Web calculator is working fine - It is Pass");
		}
		else
		{
			System.out.println("Web calculator is not working fine - It is Fail");
		}
	}

}


