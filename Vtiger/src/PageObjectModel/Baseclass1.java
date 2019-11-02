package PageObjectModel;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(FrameworkListner.class)
public class Baseclass1 {
	public static WebDriver driver;
	@BeforeTest
	public void Openbrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String url=Exceloperation.testGetData("Sheet1",1,0);
		String browser=Exceloperation.testGetData("Sheet1",1,1);
		if(browser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Drivers//chromedriver.exe");
	     driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Drivers//geckodriver.exe");
		     driver=new FirefoxDriver();
	    }
		else
		{
			System.out.println("Invalid browser");
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	@BeforeClass
	public void login()
	{
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("root");
	    driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterClass
	public void logout()
	{
		 driver.findElement(By.name("button")).click();
	}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
}


