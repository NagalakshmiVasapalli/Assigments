package UdemyAssigments;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Calendra {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		WebDriverWait exwait = new WebDriverWait(driver,100);
		driver.get("https://www.path2usa.com/travel-companions");	
		driver.findElement(By.cssSelector("#travel_date")).click();
		
		JavascriptExecutor scroll = ((JavascriptExecutor) driver);
		scroll.executeScript("scroll(0,500)");
		
		List<WebElement> Year = driver.findElements(By.xpath("//*[contains(@class,'year')]"));	
		int YearCount = Year.size();
		for(int j=0; j<YearCount; j++)
		{
			String Actual = Year.get(j).getText();
			if(Actual.equalsIgnoreCase("2021"))
			{
				Year.get(j).click();
				break;
			}
		}
		
		
		while(!driver.findElement(By.xpath("//*[@class=' table-condensed']/thead/tr[1]/th[2]")).getText().contains("Feb"))
		{
			driver.findElement(By.xpath("//*[@class=' table-condensed']/thead/tr[1]/th[3]")).click();
		}		
		
		List<WebElement> Dates = driver.findElements(By.cssSelector(".day"));
		int count =Dates.size();
		for(int i=0; i<count ; i++)
		{
			String Actual = Dates.get(i).getText();
			if(Actual.equalsIgnoreCase("14"))
			{
				Dates.get(i).click();
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.quit();
		
		
	
		/*
		exwait.until(ExpectedConditions.titleContains("MakeMyTrip"));
		boolean Homepage = driver.findElement(By.xpath("//*[contains(@class,'lhUser')]")).isDisplayed();
		System.out.println("Is home page displayed:" + Homepage );
		if(Homepage==true)
		{
		    String Onewaytext = driver.findElement(By.xpath("//*[contains(@class,'reDates')]")).getText();
			System.out.println(Onewaytext);
		  
		}
		driver.findElement(By.xpath("//*[@class='makeFlex']/ul/li[2]")).click();
		String Expected = "You are booking for more than 30 days";
		String Actual = driver.findElement(By.xpath("//*[@class='fsw_inner ']/div[4]")).getText();
		System.out.println("Content for RoundTrip is:" + Actual);		
		Calendar calendar = Calendar.getInstance();
		Date Todaydate = calendar.getTime();
		calendar.add(Calendar.DAY_OF_MONTH, 30);
		Date ReturnDate = calendar.getTime();
		System.out.println("Today date is:" + Todaydate);
		System.out.println("Tomorrow date is:" + ReturnDate);		
		driver.findElement(By.xpath("//*[@class='calHeading makeFlex']/div[2]")).sendKeys("ReturnDate");*/
		
	
		

		
		
	}

}
