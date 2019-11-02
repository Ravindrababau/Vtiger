package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newcustomview {
     @FindBy(name="viewName")
	private WebElement customview;
     @FindBy(xpath="//input[@type='submit']")
 	private WebElement Savename;
     
     {
    	PageFactory.initElements(Baseclass1.driver,this); 
     }
     public void newcustominformation(String name)
     {
    	 customview.sendKeys(name);
    	 
     }
     public void savename1()
     {
    	 Savename.click();
     }
}
