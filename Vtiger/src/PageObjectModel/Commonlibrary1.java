package PageObjectModel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Commonlibrary1 {

		public static void takescreenshot(String s) throws IOException
		{
			EventFiringWebDriver e1=new EventFiringWebDriver(Baseclass1.driver);
			File f1=e1.getScreenshotAs(OutputType.FILE);
			File f2=new File("F:\\Scrrenshots//"+s+".jpg");
			FileUtils.moveFile(f1,f2);
					}
		}
