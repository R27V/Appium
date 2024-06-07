package driverMethods;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;

public class Toggle {


	@Test
	public void toggle() throws Throwable 
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
 		
 	//	driver.toggleData(); - working
 	//	driver.toggleWifi(); - working
 	//  driver.toggleLocationServices(); - SecurityException
 		driver.toggleAirplaneMode(); 
 		
 	//	ConnectionState connection = driver.setConnection(new ConnectionStateBuilder().withDataEnabled().build());
 		
 	//	ConnectionState connection = driver.setConnection(new ConnectionStateBuilder().withAirplaneModeEnabled().build());
	}
 			
}
