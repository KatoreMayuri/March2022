package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import methods.HTMLReportGenerator;

public class Hookable
{
	@Before
    public void before(Scenario scenario) throws UnknownHostException 
    {
		HTMLReportGenerator.TestSuiteStart("E:\\jan2022Project\\flipkart.html","flipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus().toString());
		
		System.out.println(".........Scenario Starts..........");
    }
	
	@After
    public void after(Scenario scenario)
    {
    	System.out.println(".........Scenario ends..........");
    	HTMLReportGenerator.TestCaseEnd();
    	HTMLReportGenerator.TestSuiteEnd();
    	
    }
}