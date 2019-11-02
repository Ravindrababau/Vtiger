package Demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\Drivers//chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("http://localhost:8888/index.php?action=Login&module=Users");
    driver.findElement(By.name("user_name")).sendKeys("admin");
    driver.findElement(By.name("user_password")).sendKeys("root");
    driver.findElement(By.id("submitButton")).click();
    driver.findElement(By.xpath("//td[@align='center'][2]")).click();
    driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();
    Select s3=new Select(driver.findElement(By.name("salutationtype")));
	s3.selectByVisibleText("Mr.");
    driver.findElement(By.name("firstname")).sendKeys("Gogula");
    driver.findElement(By.name("lastname")).sendKeys("babu12");
    driver.findElement(By.name("company")).sendKeys("soft solutions");
    driver.findElement(By.name("designation")).sendKeys("software test engineer");
	Select s1=new Select(driver.findElement(By.name("leadsource")));
	s1.selectByVisibleText("Employee");
	Select s2=new Select(driver.findElement(By.name("industry")));
	s2.selectByVisibleText("Technology");
	 driver.findElement(By.name("annualrevenue")).sendKeys("300000");
	 driver.findElement(By.id("noofemployees")).sendKeys("300");
	 driver.findElement(By.id("secondaryemail")).sendKeys("ravindra@gmail.com");
	 driver.findElement(By.id("lead_no")).sendKeys("35");
	 driver.findElement(By.id("phone")).sendKeys("8254875695");
	 driver.findElement(By.id("fax")).sendKeys("45");
	 driver.findElement(By.id("email")).sendKeys("ravikumar@gmail.com");
	 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("www.vtiger.com");
	 Select s4=new Select(driver.findElement(By.name("leadstatus")));
	s4.selectByVisibleText("Cold");
	Select s5=new Select(driver.findElement(By.name("rating")));
	s5.selectByVisibleText("Active");
	driver.findElement(By.xpath("//input[@type='radio']")).click();
	Select s6=new Select(driver.findElement(By.name("assigned_user_id")));
	s6.selectByVisibleText("Administrator");
	 driver.findElement(By.xpath("//textarea[@rows='2']")).sendKeys("sathuluru");
	 driver.findElement(By.id("code")).sendKeys("522549");
	 driver.findElement(By.id("country")).sendKeys("INDIA");
	 driver.findElement(By.id("pobox")).sendKeys("Sathuluru");
	 driver.findElement(By.id("city")).sendKeys("Guntur");
	 driver.findElement(By.id("state")).sendKeys("Andhra pradesh");
	 driver.findElement(By.name("description")).sendKeys("He is a very good student");
	 driver.findElement(By.name("button")).click();
	 //driver.findElement(By.name("mapbutton")).click();
	// driver.findElement(By.className("detailedViewTextBox")).sendKeys("very good application");;
	 //driver.findElement(By.className("crmbutton small save")).click();
	// driver.findElement(By.partialLinkText("More Information")).click();
	// driver.findElement(By.id("show_Leads_Activities")).click();
	// driver.findElement(By.className("crmbutton small create")).click();
	// driver.findElement(By.name("subject")).sendKeys("Automation testing");
	// driver.findElement(By.name("description")).sendKeys("Automation testing vtiger application each and every modules");
	// Select s7=new Select(driver.findElement(By.name("taskstatus")));
    // s7.selectByVisibleText("In progress");
	// Select s8=new Select(driver.findElement(By.name("taskpriority")));
	 // s8.selectByVisibleText("High");
		//driver.findElement(By.xpath("//input[@type='radio']")).click();
		//Select s9=new Select(driver.findElement(By.name("assigned_user_id")));
		//s9.selectByVisibleText("Administrator");
		//Select s10=new Select(driver.findElement(By.id("starthr")));
		//s10.selectByVisibleText("07");
		//Select s11=new Select(driver.findElement(By.id("startmin")));
	//	s11.selectByVisibleText("25");
	//	Select s12=new Select(driver.findElement(By.id("startfmt")));
		//s12.selectByVisibleText("AM");
		//driver.findElement(By.id("date_start")).sendKeys("2019-02-22");
	//	driver.findElement(By.id("due_date")).sendKeys("2019-05-12");
		//driver.findElement(By.id("cellTabInvite")).click();
		//driver.findElement(By.name("sendnotification")).click();
		//driver.findElement(By.name("button")).click();
	}
 }
