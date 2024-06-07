package gestures;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SwipeGestureInDaveApp {

	@Test
	public void swipeInDave() throws Throwable 
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiAutomator2" );
		dc.setCapability("deviceName", "OnePlusNordCE3");
		dc.setCapability("UDID", "5f65e6e6");
		dc.setCapability("noReset", true);
		dc.setCapability("ignoreHiddenApiPolicyError", true);
		dc.setCapability("autoGrantPermission", true);
	
	    dc.setCapability("appPackage", "com.davemorrissey.labs.subscaleview.sample");
	    dc.setCapability("appActivity", ".MainActivity");
		
		URL url = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='View pager galleries']")).click();
		
	//	WebElement element =
		
		driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView")).click();
		
		((JavascriptExecutor)driver).executeScript
		("mobile: swipeGesture", ImmutableMap.of
		("left",145, "top", 974,"width",1068 ,"height",974 , "direction", "left", "percent", 0.75));
		
		
	}
}