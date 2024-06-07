package demo;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;


public class LaunchApp {

	@Test
	public void demo() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiAutomator2");
		dc.setCapability("deviceName", "OnePlusNordCE3");
		dc.setCapability("UDID", "5f65e6e6");
		dc.setCapability("noReset", true);
		dc.setCapability("ignoreHiddenApiPolicyError", "true");
		dc.setCapability("autoGrantPermission", true);
		
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		
		

		//setting url for appium server
		URL url = new URL("http://localhost:4723");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
//		driver.findElement(AppiumBy=.accessibilityId("Access'ibility")).click();
		
//		driver.findElement(AppiumBy.accessibilityId("Accessibility Node Provider")).click();
		
//		driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying")).click();
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Views']")).click();
		

		
		
		
		
		
	
		
	}
}
