package launchBrowser;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LaunchBrowser {

	@Test
	public void launchBrowser() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability("platformName", "Android");
 		dc.setCapability("automationName", "uiAutomator2" );
 		dc.setCapability("deviceName", "OnePlusNordCE3");
 		dc.setCapability("UDID", "5f65e6e6");
 		dc.setCapability("browserName", "chrome");
 		dc.setCapability("noReset", true);
 		dc.setCapability("ignoreHiddenApiPolicyError", true);
 		dc.setCapability("autoGrantPermission", true);
 		
 		URL url = new URL("http://localhost:4723");
 		AndroidDriver driver = new AndroidDriver(url,dc);
 		
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
 		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	}
	
}
