package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//td[@align='center'][2]")
	private WebElement Leadslink;
	@FindBy(linkText="Contacts")
	private WebElement Contactslink;
	public Homepage()
	{
		PageFactory.initElements(Baseclass1.driver, this);	
	}
public void clickonleadslink()
{
	Leadslink.click();
}
public void contactpage()
{
	   Contactslink.click();
}
}
