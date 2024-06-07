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

public class LongClickGesture {

	@Test
	public void longClickAction() throws Throwable
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiAutomator2");
		dc.setCapability("deviceName", "OnePludNordCE3");
		dc.setCapability("UDID", "5f65e6e6");
		dc.setCapability("noReset", true);
		dc.setCapability("ignoreHiddenApiPolicyError", true);
		dc.setCapability("autoGrantPermission", true);
		
		
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		URL url = new URL("http://localhost:4723");
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement ele = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"People Names\"]"));
		
		((JavascriptExecutor)driver).executeScript
		("mobile: longClickGesture",ImmutableMap.of
		("elementId",((RemoteWebElement)ele).getId(), "duration",2000));
		
		String value = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text= 'Sample menu']")).getText();
		System.out.println(value);
	}
}
