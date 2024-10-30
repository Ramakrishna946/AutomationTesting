package SampleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Incognito {
	static WebDriver driver;
	
	@Test
	public void runIncognito() throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--Incognito");
	
		//options.addArguments("--headless");
		driver= new ChromeDriver(options);
		
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.close();
		
	}
	
}
