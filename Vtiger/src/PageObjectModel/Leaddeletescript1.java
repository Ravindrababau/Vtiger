package PageObjectModel;

import org.testng.annotations.Test;

public class Leaddeletescript1 extends Baseclass1{
@Test
public void Deletelead()
{
	Homepage h1=new Homepage();
	h1.clickonleadslink();
	Leadspage l1=new Leadspage();
	l1.clickdeletebutton();
	l1.clickDeleteButton();
}

}
