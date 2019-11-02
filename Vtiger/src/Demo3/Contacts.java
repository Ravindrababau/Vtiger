package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Contacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Drivers//chromedriver.exe");
		    ChromeDriver driver=new ChromeDriver();
		    driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		    driver.findElement(By.name("user_name")).sendKeys("admin");
		    driver.findElement(By.name("user_password")).sendKeys("root");
		    driver.findElement(By.id("submitButton")).click();
		    driver.findElement(By.partialLinkText("Contacts")).click();
		    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		    Select s3=new Select(driver.findElement(By.name("salutationtype")));
		    s3.selectByIndex(2);
		    driver.findElement(By.name("firstname")).sendKeys("kiran");
		    driver.findElement(By.name("lastname")).sendKeys("kumar");
		    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ABHR");
		    Select s2=new Select(driver.findElement(By.name("leadsource")));
		    s2.selectByIndex(4);
		    driver.findElement(By.id("title")).sendKeys("Qspiders");
		    driver.findElement(By.id("department")).sendKeys("Information Technology");
		    driver.findElement(By.id("email")).sendKeys("Qspiders@gmail.com");
		    driver.findElement(By.id("assistant")).sendKeys("Test engineer");
		    driver.findElement(By.id("assistantphone")).sendKeys("9587921455");
		    driver.findElement(By.name("emailoptout")).click();
		    driver.findElement(By.id("contact_no")).sendKeys("shiva");
		    driver.findElement(By.id("phone")).sendKeys("965125544");
		    driver.findElement(By.id("homephone")).sendKeys("9998544622");
		    driver.findElement(By.id("otherphone")).sendKeys("999845587");
		    driver.findElement(By.id("fax")).sendKeys("999");
		    driver.findElement(By.name("birthday")).sendKeys("2019-02-22");
		    driver.findElement(By.id("secondaryemail")).sendKeys("ravi@gmail.com");
		   // driver.findElement(By.name("//input[@type='radio'][1]")).click();
		   // Select s4=new Select(driver.findElement(By.name("assigned_user_id")));
		  //  s4.selectByVisibleText("Administrator");
		    driver.findElement(By.name("portal")).click();
		    driver.findElement(By.xpath("//input[@value='2019-10-13']")).sendKeys("2018-05-25");
		    driver.findElement(By.name("support_end_date")).sendKeys("2019-10-15");
		    driver.findElement(By.xpath("//input[@onclick='return copyAddressRight(EditView)']")).click();
		    driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("kanaparru,gutur");
		    driver.findElement(By.id("mailingpobox")).sendKeys("sathuluru");
		    driver.findElement(By.id("mailingcity")).sendKeys("Guntur");
		    driver.findElement(By.id("mailingstate")).sendKeys("Andhra pradesh");
		    driver.findElement(By.id("mailingzip")).sendKeys("522549");
		    driver.findElement(By.id("mailingcountry")).sendKeys("INDIA");
		    driver.findElement(By.name("description")).sendKeys("software testing is a testing the build");
		    driver.findElement(By.name("button")).click();
		    
		   	}

}
