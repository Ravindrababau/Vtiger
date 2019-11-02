package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leadsdelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Drivers//chromedriver.exe");
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		    driver.findElement(By.name("user_name")).sendKeys("admin");
		    driver.findElement(By.name("user_password")).sendKeys("root");
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.xpath("//td[@align='center'][2]")).click();
		    driver.findElement(By.name("selected_id")).click();
		    driver.findElement(By.xpath("//input[@value='Delete']")).click();
		    driver.switchTo().alert().accept();
	}

}
