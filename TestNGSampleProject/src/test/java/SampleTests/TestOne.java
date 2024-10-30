package SampleTests;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class TestOne {
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void browserTest(String browsername) throws InterruptedException, IOException {
		
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("--headless");
		options.addArguments("--incognito");
		
		
		
		if(browsername.equals("Chrome")) {
			driver=new ChromeDriver(options);
		}
		if(browsername.equals("Edge")) {
			driver=new EdgeDriver();
		}
		if(browsername.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		
		//driver=new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement element=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		element.sendKeys("The Universe");
		Thread.sleep(3000);
		List<WebElement> elementlist=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		for(WebElement ele2 : elementlist) {
			String Text=ele2.getText();
			System.out.println(Text);
		}
		
		int size=elementlist.size();
		System.out.println(size);
		elementlist.get(size-8).click();
		String Title=driver.getTitle();
		System.out.println("The current page title is " +Title);
		
		if(browsername.equals("Chrome")) {
			File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			Files.copy(Screenshot,new File("D:\\Ramakrishna\\Personal\\Cyber crime case\\screenshots\\Selenium\\ChromeScreenshot18866.jpg"));
			
		}
		if(browsername.equals("Edge")) {
			File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			Files.copy(Screenshot,new File("D:\\Ramakrishna\\Personal\\Cyber crime case\\screenshots\\Selenium\\EdgeScreenshot1.jpg"));
			
		}
		if(browsername.equals("Firefox")) {
			Thread.sleep(2000);
			File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			Files.copy(Screenshot,new File("D:\\Ramakrishna\\Personal\\Cyber crime case\\screenshots\\Selenium\\FirefoxScreenshot1.jpg"));
			
		}
		
		File Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(Screenshot,new File("D:\\Ramakrishna\\Personal\\Cyber crime case\\screenshots\\Selenium\\Screenshot1.jpg"));
		
		
		driver.close();
		driver.quit();
		
		
		
		
		
	}
	

}
