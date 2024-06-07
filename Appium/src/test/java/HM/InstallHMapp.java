package HM;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

@Test
public class InstallHMapp {

	public void installHMapp() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability("platformName", "Android");
 		dc.setCapability("automationName", "uiAutomator2" );
 		dc.setCapability("deviceName", "OnePlusNordCE3");
 		dc.setCapability("UDID", "5f65e6e6");
 		dc.setCapability("noReset", true);
 		dc.setCapability("ignoreHiddenApiPolicyError", true);
 		dc.setCapability("autoGrantPermission", true);
		
	//	dc.setCapability("app", "C:\\Users\\YASH\\Downloads\\AppiumPractice\\HM_v22.15.1.apk");
		
		dc.setCapability(null, false);
		URL url = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(url, dc);
	   
		Thread.sleep(2000);
		driver.installApp("C:\\Users\\YASH\\Downloads\\AppiumPractice\\HM_v22.15.1.apk");
		
		
	}
}
