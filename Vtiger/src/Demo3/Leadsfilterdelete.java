package Demo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 public class Leadsfilterdelete {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver","C:\\Drivers//chromedriver.exe");
		    ChromeDriver driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		    driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		    driver.findElement(By.name("user_name")).sendKeys("admin");
		    driver.findElement(By.name("user_password")).sendKeys("root");
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.xpath("//td[@align='center'][2]")).click();
		    driver.findElement(By.linkText("Create Filter")).click();
		    driver.findElement(By.name("viewName")).sendKeys("Prem");
		    driver.findElement(By.xpath("//b[contains(text(),'Standard Filters')]")).click();
		    driver.findElement(By.name("button2")).click();
		   driver.findElement(By.linkText("Edit")).click();
		    driver.findElement(By.name("viewName")).sendKeys("Prem12");
		    driver.findElement(By.xpath("//b[contains(text(),'Standard Filters')]")).click();
		    driver.findElement(By.name("button2")).click();
		    driver.findElement(By.linkText("Delete")).click();
		    driver.switchTo().alert().accept();
		    }
	}
