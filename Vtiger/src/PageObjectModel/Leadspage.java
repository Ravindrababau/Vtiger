package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadspage {
	@FindBy(xpath="//input[@value='16']")
	private WebElement Leaddelete;
	@FindBy(linkText="del")
	private WebElement Leaddelete1;
	@FindBy(linkText="edit")
	private WebElement Leadmassedit;
	@FindBy(linkText="Create Filter")
	private WebElement Createfilter;
	
	
  public Leadspage()
	{
	PageFactory.initElements(Baseclass1.driver, this);	
	}
   public void clickdeletebutton()
   {
	   Leaddelete.click();
   }
   public void clickDeleteButton()
   {
	   Leaddelete1.click();
	   Baseclass1.driver.switchTo().alert().accept();
   }
   public void clickeditbutton()
   {
	   Leadmassedit.click();
   }
   public void Filtercreate()
   {
	   Createfilter.click();
   }
  
}




