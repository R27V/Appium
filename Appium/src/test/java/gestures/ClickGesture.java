package gestures;

import java.net.MalformedURLException;
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

public class ClickGesture {

 	@Test
 	public void click() throws Throwable
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
 		
 		//AndroidDriver driver = new AndroidDriver(url, dc);
 		AndroidDriver driver = new AndroidDriver(url,dc);
 		
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		
 		((JavascriptExecutor)driver).executeScript
 		("mobile: clickGesture", ImmutableMap.of
 		("x",383,"y",642));
 		
// 		WebElement element = driver.findElement(AppiumBy.)
// 		((JavascriptExecutor)driver).executeScript
// 		("mobile: clickGesture", ImmutableMap.of
// 		("elementId", ((RemoteWebElement)element).getId()));
// 		
 	}
}
