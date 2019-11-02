package PageObjectModel;

import org.testng.annotations.Test;

public class CreatefilterTestscript3 extends Baseclass1{
@Test

public void Createfilt() {	
	Homepage h1=new Homepage();
	h1.clickonleadslink();
	Leadspage l1=new Leadspage();
	l1.Filtercreate();
	Newcustomview n1=new Newcustomview();
	n1.newcustominformation("babu");
	n1.savename1();
}
}