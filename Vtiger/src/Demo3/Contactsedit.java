package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contactsedit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers//chromedriver.exe");
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		    driver.findElement(By.name("user_name")).sendKeys("admin");
		    driver.findElement(By.name("user_password")).sendKeys("root");
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.partialLinkText("Contacts")).click();
		    //driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		    driver.findElement(By.name("search_text")).sendKeys("kumar");
		    Select s3=new Select(driver.findElement(By.name("search_field")));
		    s3.selectByIndex(2);
		    driver.findElement(By.xpath("//input[@value=' Search Now ']")).click();
		    driver.findElement(By.linkText("edit")).click();
		    driver.findElement(By.name("firstname")).sendKeys("ravindra");
		    driver.findElement(By.name("button")).click();
		    driver.findElement(By.linkText("del")).click();
		    driver.switchTo().alert().accept();
	}

}
