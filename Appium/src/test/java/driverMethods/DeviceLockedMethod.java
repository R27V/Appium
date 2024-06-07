package driverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class DeviceLockedMethod {

	@Test
	public void driverMethods() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability("platformName", "Android");
 		dc.setCapability("automationName", "uiAutomator2" );
 		dc.setCapability("deviceName", "OnePlusNordCE3");
 		dc.setCapability("UDID", "5f65e6e6");
 		dc.setCapability("noReset", true);
 		dc.setCapability("ignoreHiddenApiPolicyError", true);
 		dc.setCapability("autoGrantPermission", true);
 		
 	//	dc.setCapability("appPackage", "io.appium.android.apis");
	//	dc.setCapability("appActivity", ".ApiDemos");
 		
 		URL url = new URL("http://localhost:4723");
 		AndroidDriver driver = new AndroidDriver(url,dc);
 		//1 install- To install the application 
 //		driver.installApp("C:\\Users\\YASH\\Downloads\\AppiumPractice\\General-Store.apk");
 		
 		//2 Verify - To check whether app is installed or not 
 		//driver.isAppInstalled("com.androidsample.generalstore");
 		System.out.println("Driver is intalled "+driver.isAppInstalled("com.androidsample.generalstore"));
 		
 		//3 Uninstall - To uninstall the app  
 		//driver.removeApp("com.androidsample.generalstore");
 		
 		Thread.sleep(2000);
 		//4 - activateApp
 	//	driver.activateApp("com.androidsample.generalstore");
 		
 		//7- isDeviceLocked
 		System.out.println("Device is Locked "+driver.isDeviceLocked());
 		
 		//8- openNotifications
 		driver.openNotifications();
 		
 		//9- hideKeyboard
 		
 		
	}
}
