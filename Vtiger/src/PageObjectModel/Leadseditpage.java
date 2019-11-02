package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadseditpage {
	@FindBy(name="firstname")
	private WebElement Leadmassedit1;
	@FindBy(xpath="//input[@name='button']")
	private WebElement Saveedit;
	public Leadseditpage()
	{
	PageFactory.initElements(Baseclass1.driver, this);	

	}
	public void Enterfirstname(String name)
	{
		Leadmassedit1.sendKeys(name);
	}
	public void Saveeditbutton()
	{
		Saveedit.click();
	}
	
	
	
	}

	
	
