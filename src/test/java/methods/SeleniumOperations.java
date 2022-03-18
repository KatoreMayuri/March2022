package methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations 
{
	public static WebDriver driver;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	public static Hashtable<String,Object>  browserLanch(Object[] inputParameters)
	{
		try
		{
		String browserName=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		System.setProperty(browserName, exe);
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		
		 outputParameters.put("STATUS","PASS");
		 outputParameters.put("MESSAGE","methodUsed:browserLanch,Input_Data :" +inputParameters[1].toString());
		}
		catch(Exception e)
		{

	      outputParameters.put("STATUS","FAIL");
	      outputParameters.put("MESSAGE","methodUsed:browserLanch,Input_Data :" +inputParameters[1].toString());
		}
		return outputParameters;
	 
	}
	
	public static Hashtable<String,Object> openApplication(Object[] inputParameters)
	{
		try
		{
		String url=(String) inputParameters[0];
		driver.get(url);
		 outputParameters.put("STATUS","PASS");
		 outputParameters.put("MESSAGE","methodUsed:openApplication ,Input_Data :" +inputParameters[0].toString());
		 }
		catch(Exception e)
		{
			 outputParameters.put("STATUS","FAIL");
			 outputParameters.put("MESSAGE","methodUsed:openApplication ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> clickOnElement(Object[]inputParameters)
	{
		try {
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		 outputParameters.put("STATUS","PASS");
		 outputParameters.put("MESSAGE","methodUsed: clickOnElement ,Input_Data :" +inputParameters[0].toString());
		}catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			 outputParameters.put("MESSAGE","methodUsed: clickOnElement ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> loginWindow(Object[]inputParameters)
	{
		try
		{
		String abc=(String) inputParameters[0];
		WebElement log=driver.findElement(By.xpath(abc));
		Actions act=new Actions(driver);
		act.moveToElement(log).build().perform();
		outputParameters.put("STATUS","PASS");
		 outputParameters.put("MESSAGE","methodUsed:loginWindow ,Input_Data :" +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			 outputParameters.put("MESSAGE","methodUsed:loginWindow ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
		
	}
	public static Hashtable<String,Object> profile(Object[] inputParameters)
	{
		try
		{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String xpath=(String) inputParameters[0];
		String uname=(String) inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(uname);
		outputParameters.put("STATUS","PASS");
		 outputParameters.put("MESSAGE","methodUsed: profile ,Input_Data :" +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			 outputParameters.put("MESSAGE","methodUsed: profile ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
	}
	public static Hashtable<String,Object> sucessfulLogin(Object[] inputParameters)
	{
		try
		{
		Thread.sleep(3000);
		String givenText=(String) inputParameters[0];
		String xpath1=(String) inputParameters[1];
		String actualText=driver.findElement(By.xpath(xpath1)).getText();
		
		if(givenText.equalsIgnoreCase(actualText))
		{
			System.out.println("TEST PASS");
		}else
		{
			System.out.println("TEST FAILED");
		}
		 outputParameters.put("STATUS","PASS");
		 outputParameters.put("MESSAGE","methodUsed:sucessfulLogin ,Input_Data :" +inputParameters[0].toString());
		}
		catch(Exception e)
		{
			outputParameters.put("STATUS","FAIL");
			 outputParameters.put("MESSAGE","methodUsed:sucessfulLogin ,Input_Data :" +inputParameters[0].toString());
		}
		return outputParameters;
		
	}
	
	
	public static void main(String[] args)
	{
		//launch Browser
		Object[] input=new Object[2];
		input[0]="webdriver.chrome.driver";
		input[1]="C:\\jan22Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver1.exe";
	   SeleniumOperations.browserLanch(input);
	   
	   //open Application
	   Object[] input1=new Object[1];
	   input1[0]="https://www.flipkart.com/";
	   SeleniumOperations.openApplication(input1);
	   
	   //click on cancel
	   Object[] input2=new Object[1];
	   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
	   SeleniumOperations.clickOnElement(input2);
	   
	   //Mouse move to login Button
	   Object[] input3=new Object[1];
	   input3[0]="//*[@class='_1_3w1N']";
	   SeleniumOperations.loginWindow(input3);
	   
	   //click On MyProfile
	   Object[] input4=new Object[1];
	   input4[0]="(//*[@class='_3vhnxf'])[1]";
	   SeleniumOperations.clickOnElement(input4);
	   
	   //myProfileWindow--username
	   Object[] input5=new Object[2];
	   input5[0]="(//*[@type='text'])[2]";
	   input5[1]="katoremayuri2014@gmail.com";
	   SeleniumOperations.profile(input5);
	  
	   
	  //passwaord
	   Object[] input6=new Object[2];
	   input6[0]="//*[@type='password']";
	   input6[1]="Swami@2596";
	   SeleniumOperations.profile(input6);
	
	  //click on login
		Object[] input7=new Object[1];
	    input7[0]="(//*[@type='submit'])[2]";
		SeleniumOperations.clickOnElement(input7);
		
		//SuccessfulLogin
		  Object[] input8=new Object[2];
		  input8[0]="Mayuri Katore";
		  input8[1]="//*[text()='Mayuri Katore']";
		  SeleniumOperations.sucessfulLogin(input8);
		
		
	  }
	

 }
