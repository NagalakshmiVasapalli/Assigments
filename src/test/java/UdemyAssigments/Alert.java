package UdemyAssigments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir" , "\\src\\test\\java\\chromedriver.exe"));
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

}
