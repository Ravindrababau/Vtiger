package Demo3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leadsfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver","C:\\Drivers//chromedriver.exe");
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		    driver.findElement(By.name("user_name")).sendKeys("admin");
		    driver.findElement(By.name("user_password")).sendKeys("root");
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.xpath("//td[@align='center'][2]")).click();
		    driver.findElement(By.linkText("Create Filter")).click();
		    driver.findElement(By.name("viewName")).sendKeys("Premchand12");
		    driver.findElement(By.xpath("//b[contains(text(),'Standard Filters')]")).click();
		    driver.findElement(By.name("button2")).click();
		     WebElement w1=driver.findElement(By.name("viewname"));
		    Select s1=new Select(w1);
		    List <WebElement> l1=s1.getOptions();
		    for(int i=0;i<l1.size();i++)
		    {
		    	if(l1.get(i).getText().equals("Premchand12"))
             {
		       System.out.println("Integration is pass successfully");
             }
         
}
}
}
	
	
	
	
	
	
	