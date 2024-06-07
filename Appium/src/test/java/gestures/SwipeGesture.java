package gestures;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class SwipeGesture {

	@Test
	public void swipe() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability("platformName", "Android");
 		dc.setCapability("automationName", "uiAutomator2" );
 		dc.setCapability("deviceName", "OnePlusNordCE3");
 		dc.setCapability("UDID", "5f65e6e6");
 		dc.setCapability("noReset", true);
 		dc.setCapability("ignoreHiddenApiPolicyError", true);
 		dc.setCapability("autoGrantPermission", true);
 		
 		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.Gallery[@resource-id=\"io.appium.android.apis:id/gallery\"]/android.widget.ImageView[2]"));
		
//		((JavascriptExecutor)driver).executeScript
//		("mobile: swipeGesture", ImmutableMap.of
//		("left", 71 ,"top", 396, "width", 944 , "height",396 , "direction", "left", "percent" , 0.85));
//		
		((JavascriptExecutor)driver).executeScript
		("mobile: swipeGesture", ImmutableMap.of
		("elementId",((RemoteWebElement)element).getId(), "direction", "left", "percent", 0.62));
		
		
	}
}
