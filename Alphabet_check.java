package Web_Calc;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alphabet_check {

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chromedriver", 
				"C:\\Users\\user\\Desktop\\Executable files\\Drivers.chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@ class = 'gLFyf']")).sendKeys("Web Calculator");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement ele1 = driver.findElement(By.xpath("//div[@jsname = 'zLiRgc']"));
		boolean disp_box = ele1.isEnabled();
		if (disp_box)
		{
			System.out.println("Selected display box is enabled");
		}
		else
		{
			throw new RuntimeException("It is disabled");
		}
		ele1.click();		
	   	r.keyPress(KeyEvent.VK_B);
		r.keyRelease(KeyEvent.VK_B);
		String alphabet = driver.findElement(By.xpath("//div[@class = 'z7BZJb XSNERd']//span[@class = 'qv3Wpe']")).getText();
	  	if (alphabet=="a")
		{
			System.out.println("Web calculator is accepting the alphabet - It is fail");
		}
		else
		{
			System.out.println("Web calculator is not accepting the alphabet - It is Pass");
		}
	}

}
