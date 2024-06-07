package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class PressKeyMethod {

	@Test
	public void keyMethods() throws Throwable 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability("platformName", "Android");
 		dc.setCapability("automationName", "uiAutomator2" );
 		dc.setCapability("deviceName", "OnePlusNordCE3");
 		dc.setCapability("UDID", "5f65e6e6");
 		dc.setCapability("noReset", true);
 		dc.setCapability("ignoreHiddenApiPolicyError", true);
 		dc.setCapability("autoGrantPermission", true);
 		dc.setCapability("unlockType", "Pattern");
 		dc.setCapability("unlockKey", "14789");
 		
 		URL url = new URL("http://localhost:4723");
 		AndroidDriver driver = new AndroidDriver(url,dc);
 		
 		driver.activateApp("com.androidsample.generalstore");
 		
 	//	driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
 //		driver.pressKey(new KeyEvent(AndroidKey.ALT_LEFT));
 	//	driver.pressKey(new KeyEvent(AndroidKey.ALT_RIGHT));
 //		driver.pressKey(new KeyEvent(AndroidKey.APOSTROPHE));
 		driver.pressKey(new KeyEvent(AndroidKey.ASSIST)); //google assistant is open
// 		driver.pressKey(new KeyEvent(AndroidKey.AT));
// 		driver.pressKey(new KeyEvent(AndroidKey.AVR_INPUT));
// 		driver.pressKey(new KeyEvent(AndroidKey.AVR_POWER));
		
	}
}
