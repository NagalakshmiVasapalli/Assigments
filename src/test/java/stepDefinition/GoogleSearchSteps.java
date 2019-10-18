package stepDefinition;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class GoogleSearchSteps {
	
	WebDriver driver;
	WebElement search;
	String url = "https://www.google.com";
	String text = "software testing help";


	 @Given("^Browser is launched$")
	    public void browser_is_launched() throws Throwable {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chummy\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   
	    }

	    @When("^Google Search page is displayed$")
	    public void google_search_page_is_displayed() throws Throwable {
	    	String Expected = driver.getTitle();
	    	String actual = "Google";
	    	Assert.assertEquals(Expected, actual);
	      
	    }

	    @Then("^Respective results should be displayed$")
	    public void respective_results_should_be_displayed() throws Throwable {
	    	String Expected = driver.getTitle();
	    	String actual = "software testing help";
	    	Assert.assertEquals(Expected, actual);
	    }

	    @And("^User enters \"([^\"]*)\"$")
	    public void user_enters_something(String url) throws Throwable {
	    	driver.get(url);
	    }

	    @And("^User enters required \"([^\"]*)\"$")
	    public void user_enters_required_something(String text) throws Throwable {
	    	
	    	search = driver.findElement(By.xpath("//*[starts-with(@class,'gLFyf')]"));
			search.sendKeys(text);
	        
	    }

	    @And("^Click on enter$")
	    public void click_on_enter() throws Throwable {
	    	search.sendKeys(Keys.ENTER);
	    }	    

}
