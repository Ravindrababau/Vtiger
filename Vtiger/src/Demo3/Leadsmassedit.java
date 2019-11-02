package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leadsmassedit {

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
		    driver.findElement(By.name("search_text")).sendKeys("Gogula");
		    Select s6=new Select(driver.findElement(By.name("search_field")));
			s6.selectByVisibleText("First Name");
			   driver.findElement(By.name("submit")).click();
			   driver.findElement(By.partialLinkText("edit")).click();
			   driver.findElement(By.name("firstname")).sendKeys("Ravindra");
			   driver.findElement(By.name("button")).click();
		   // driver.findElement(By.xpath("//input[@value='Mass Edit']")).click();
		  //  driver.findElement(By.xpath("//b[text()='Lead Information']")).click();
		  //  driver.findElement(By.id("lastname_mass_edit_check")).click();
		    //driver.findElement(By.xpath("//input[@name='lastname_mass_edit_check']")).click();
		    //driver.findElement(By.name("lastname")).sendKeys("sahoo");
		  //  driver.findElement(By.xpath("//input[@value='Save']")).click();
		   
	}

}
