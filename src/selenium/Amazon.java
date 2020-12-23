package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get("https://www.amazon.in/ref=nav_logo");
		 
		 driver.manage().window().maximize();
		 
		 
		 
	}

}
