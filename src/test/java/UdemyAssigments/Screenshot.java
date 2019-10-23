package UdemyAssigments;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import cucumber.api.Scenario;

public class Screenshot {
	
		@Test
		public static void tearDown(Scenario scenario)
		
		{
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			if(scenario.isFailed())
			{
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image.png");
			}
			
		}
		
		
	}

