package PageObjectModel;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class FrameworkListner implements ITestListener{
	
public void onTestFailure(ITestResult rv)
{
	String s=rv.getName();
	try {
		Commonlibrary1.takescreenshot(s);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
