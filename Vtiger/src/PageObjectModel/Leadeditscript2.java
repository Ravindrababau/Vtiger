package PageObjectModel;

import org.testng.annotations.Test;

public class Leadeditscript2 extends Baseclass1 {
	@Test
	public void EditDetails()
	{
		Homepage h1=new Homepage();
		h1.clickonleadslink();
		Leadspage l1=new Leadspage();
		l1.clickdeletebutton();
		l1.clickeditbutton();
		Leadseditpage l2=new Leadseditpage();
		l2.Enterfirstname("kiran");
		l2.Saveeditbutton();
	}
}
