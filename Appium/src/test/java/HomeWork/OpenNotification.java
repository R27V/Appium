package HomeWork;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class OpenNotification {

	@Test
	public void openNotification() throws MalformedURLException, Throwable
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
 		
		driver.openNotifications();
		
	//	driver.findElement(AppiumBy.xpath("//android.widget.LinearLayout[@resource-id=\"android:id/actions\"]")).click();
		driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@resource-id=\"android:id/notification_top_line\"])[1]")).click();
//		driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@resource-id=\"android:id/notification_top_line\"])[3]")).click();
//		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Transferring files via USB\")")).click();
		
		Thread.sleep(1000);
		driver.openNotifications();
		driver.findElement(AppiumBy.id("com.android.systemui:id/clear_all_port")).click();
		
	}
}
