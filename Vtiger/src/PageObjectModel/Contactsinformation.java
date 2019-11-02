package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactsinformation {
@FindBy(name="firstname")
private WebElement Contactinfo;
@FindBy(xpath="//input[@type='submit']")
private WebElement Contactsave;
Contactsinformation()
{
	PageFactory.initElements(Baseclass1.driver, this);
}
public void firstname(String name)
{
	Contactinfo.sendKeys(name);
}
public void savebutton()
{
	Contactsave.click();
}
}

