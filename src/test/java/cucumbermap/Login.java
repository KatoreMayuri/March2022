package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;
import methods.SeleniumOperations;
public class Login
{
	@When ("^user opens \"(.*)\" browser with exe as \"(.*)\"$")
	public void lanchBrowser(String bname, String exe )
	{
		Object[] input=new Object[2];
		input[0]=bname;
		input[1]=exe;
	   SeleniumOperations.browserLanch(input);
	}
	@When ("^user open URL as \"(.*)\"$")
	public void openApp(String url)
	{
		 Object[] input1=new Object[1];
		 input1[0]=url;
		 SeleniumOperations.openApplication(input1);
    }
	@When ("^user click on cancel button")
		public void cancelWindow()
		{
		   Object[] input2=new Object[1];
		   input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		  // SeleniumOperations.clickOnElement(input2);
		   
		   Hashtable<String,Object> input2op=SeleniumOperations.clickOnElement(input2);
		   HTMLReportGenerator.StepDetails(input2op.get("STATUS").toString(),"user click on cancel button",input2op.get("MESSAGE").toString());
		   
		}
	@When ("user navigate on login")
	public void moveToLogin()
	{
		   Object[] input3=new Object[1];
		   input3[0]="//*[@class='_1_3w1N']";
		 //  SeleniumOperations.loginWindow(input3);
		   
		   Hashtable<String,Object> input3op=SeleniumOperations.loginWindow(input3);
		   HTMLReportGenerator.StepDetails(input3op.get("STATUS").toString(),"user navigate on login",input3op.get("MESSAGE").toString());
		   
    }
	@When ("^user click on MyProfile")
	public void myProfile()
	{
		   Object[] input4=new Object[1];
		   input4[0]="(//*[@class='_3vhnxf'])[1]";
		//   SeleniumOperations.clickOnElement(input4);
		   Hashtable<String,Object> input4op=SeleniumOperations.clickOnElement(input4);
		   HTMLReportGenerator.StepDetails(input4op.get("STATUS").toString(),"user click on MyProfile",input4op.get("MESSAGE").toString());
		   
    }	
	@When ("^user enter username as  \"(.*)\"$")
	public void userName(String uname)
	{
		   Object[] input5=new Object[2];
		   input5[0]="(//*[@type='text'])[2]";
		   input5[1]=uname;
		 //  SeleniumOperations.profile(input5);
		   Hashtable<String,Object> input5op=SeleniumOperations.profile(input5);
		   HTMLReportGenerator.StepDetails(input5op.get("STATUS").toString(),"user enter username as  \"(.*)\"$",input5op.get("MESSAGE").toString());
		   
		   
	 }
	@When ("^user enter valid password as \"(.*)\"$")
	public void passWord(String pass)
	{
		   Object[] input6=new Object[2];
		   input6[0]="//*[@type='password']";
		   input6[1]=pass;
		  // SeleniumOperations.profile(input6);
		   Hashtable<String,Object> input6op=SeleniumOperations.profile(input6);
		   HTMLReportGenerator.StepDetails(input6op.get("STATUS").toString(),"user enter valid password as \\\"(.*)\\\"$",input6op.get("MESSAGE").toString());
		   
		   
	}
	@When ("^user click on login")
	public void finalLogin()
	{
		Object[] input7=new Object[1];
	    input7[0]="(//*[@type='submit'])[2]";
		//SeleniumOperations.clickOnElement(input7);
		
		   Hashtable<String,Object> input7op=SeleniumOperations.clickOnElement(input7);
		   HTMLReportGenerator.StepDetails(input7op.get("STATUS").toString(),"user click on login",input7op.get("MESSAGE").toString());
		   
	}
	@Then ("^Application shows login successfully$")
	public void loginSuccessful()
	{
	     
		   Object[] input8=new Object[2];
		   input8[0]="Mayuri Katore";
		   input8[1]="//*[text()='Mayuri Katore']";
		  // SeleniumOperations.sucessfulLogin(input8);
		   
		   Hashtable<String,Object> input8op=SeleniumOperations.sucessfulLogin(input8);
		   HTMLReportGenerator.StepDetails(input8op.get("STATUS").toString(),"Application shows login successfully$",input8op.get("MESSAGE").toString());
		   
		   
	}

}