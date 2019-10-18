package UdemyAssigments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notepad_Write_Read {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//java//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String text = driver.findElement(By.cssSelector(".gb_e")).getText();
		System.out.println("Text is:" + " " + text);
		
		// Writing a file
		File file = new File(System.getProperty("user.dir") + "//src//test//java//Notepad.txt");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);	
		bw.write(text);
		bw.close();
		
		//Reading a file
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String Rtext = br.readLine();
		System.out.println("The text in file:" + Rtext);
		br.close();
		
		driver.quit();	
		
	


	}

}
