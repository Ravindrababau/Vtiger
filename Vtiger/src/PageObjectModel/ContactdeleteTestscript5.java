package PageObjectModel;

import org.testng.annotations.Test;

public class ContactdeleteTestscript5 extends Baseclass1{
@Test
public void deltecontact()
{
	Homepage h1=new Homepage();
	h1.contactpage();
	Contactspage c1=new Contactspage();
	c1.Deletecontact();
	c1.deletecontactperson();
}
}
