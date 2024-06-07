package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

@Test
public class Calculator {

	@Test
	public void performAddSub() throws Throwable {
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiAutomator2");
		dc.setCapability("deviceName", "OnePlusNordCE3");
		dc.setCapability("UDID", "5f65e6e6");
		dc.setCapability("noReset", true);
		dc.setCapability("ignoreHiddenApiPolicyError", "true");
		dc.setCapability("autoGrantPermission", true);
		
		 dc.setCapability("appPackage", "com.tricolorcat.calculator");
		 dc.setCapability("appActivity", ".MainActivity");
		 
		 URL url = new URL("http://localhost:4783");
		 
		 AndroidDriver driver = new AndroidDriver(url, dc);
		 
			//	driver.findElement(AppiumBy.accessibilityId("com.tricolorcat.calculator:id/eight")).click();
			driver.findElement(AppiumBy.xpath("//android.widget.Button[@resource-id=\"com.tricolorcat.calculator:id/eight\"]")).click();
//			driver.findElement(AppiumBy.accessibilityId("com.tricolorcat.calculator:id/plus")).click();
//			driver.findElement(AppiumBy.accessibilityId("com.tricolorcat.calculator:id/six")).click();
		
			driver.findElement(AppiumBy.id("com.tricolorcat.calculator:id/plus")).click();
			driver.findElement(AppiumBy.id("com.tricolorcat.calculator:id/six")).click();
			
			driver.findElement(AppiumBy.id("com.tricolorcat.calculator:id/equal")).click();
			
			String result = driver.findElement(AppiumBy.id("com.tricolorcat.calculator:id/display")).getText();
			
			System.out.println(result);
			
	}
	
}
