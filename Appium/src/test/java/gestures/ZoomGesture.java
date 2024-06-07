package gestures;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ZoomGesture {

	@Test
	public void zoom() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability("platformName", "Android");
 		dc.setCapability("automationName", "uiAutomator2" );
 		dc.setCapability("deviceName", "OnePlusNordCE3");
 		dc.setCapability("UDID", "5f65e6e6");
 		dc.setCapability("noReset", true);
 		dc.setCapability("ignoreHiddenApiPolicyError", true);
 		dc.setCapability("autoGrantPermission", true);
		
		
 		dc.setCapability("app", "C:\\Users\\YASH\\Downloads\\AppiumPractice\\com.davemorrissey.labs.subscaleview.sample.apk");
		
		URL url = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/eventHandling")).click();
		
		WebElement ele = driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
		
		((JavascriptExecutor) driver).executeScript
		("mobile: pinchOpenGesture", ImmutableMap.of
		("elementId", ((RemoteWebElement) ele).getId(),"percent", 0.95));
		

		((JavascriptExecutor)driver).executeScript
		("mobile: pinchCloseGesture", ImmutableMap.of
	    ("elementId",((RemoteWebElement)ele).getId(),"percent", 0.75));	
				
	}
}
