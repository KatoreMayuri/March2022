package plainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase
{
	static ChromeDriver driver;
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\jan22Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver1.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		//Cancel first login window
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		Actions act=new Actions(driver);
		WebElement abc =driver.findElementByXPath("//*[@class='_1_3w1N']");
		act.moveToElement(abc).build().perform();
		
		//My Profile
		driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]").click();
		
		//Enter UserName
		driver.findElementByXPath("(//*[@type='text'])[2]").sendKeys("katoremayuri2014@gmail.com");
		
		//Enter Password
		driver.findElementByXPath("//*[@type='password']").sendKeys("Swami@2596");
		
		//Click on Login
		driver.findElementByXPath("(//*[@type='submit'])[2]").click();
	}

}

