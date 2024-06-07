package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HideKeyboardMethod {

	@Test
	public void hideKeyboard() throws Throwable 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability("platformName", "Android");
 		dc.setCapability("automationName", "uiAutomator2" );
 		dc.setCapability("deviceName", "OnePlusNordCE3");
 		dc.setCapability("UDID", "5f65e6e6");
 		dc.setCapability("noReset", true);
 		dc.setCapability("ignoreHiddenApiPolicyError", true);
 		dc.setCapability("autoGrantPermission", true);
 		
 		URL url = new URL("http://localhost:4723");
 		AndroidDriver driver = new AndroidDriver(url,dc);
 		
 		driver.activateApp("com.androidsample.generalstore");
 		
 		Thread.sleep(3000);
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter name here']")).click();
 		
 		Thread.sleep(2000);
 		driver.hideKeyboard();
 		
 		
	}
}
