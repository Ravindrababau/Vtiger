package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactspage {
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
   private	WebElement Createcontact;
	@FindBy(id="29")
	 private WebElement selectcheckbox;
	@FindBy(linkText="dele")
	 private WebElement Deletecontacename;
	Contactspage()
	{
		PageFactory.initElements(Baseclass1.driver,this);
	}
	public void Createcontact()
	{
		Createcontact.click();
	}
	public void Deletecontact()
	{
		selectcheckbox.click();
	}
 public void deletecontactperson()
 {
	 Deletecontacename.click();
	 Baseclass1.driver.switchTo().alert().accept();
 }
}
