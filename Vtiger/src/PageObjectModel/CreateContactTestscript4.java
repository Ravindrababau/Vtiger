package PageObjectModel;

import org.testng.annotations.Test;

public class CreateContactTestscript4 extends Baseclass1 {
	@Test
	public void Createcontact()
	{

		Homepage h1=new Homepage();
		h1.clickonleadslink();
		h1.contactpage();
		Contactspage c1=new Contactspage();
		c1.Createcontact();
		Contactsinformation c2=new Contactsinformation();
		c2.firstname("anuu");
		c2.savebutton();
	}

}
