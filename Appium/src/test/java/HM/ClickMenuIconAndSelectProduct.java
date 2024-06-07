package HM;

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

public class ClickMenuIconAndSelectProduct {

	@Test
	public void productFromFavourite() throws MalformedURLException, Throwable
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
 		
 		
 		driver.activateApp("com.hm.goe");
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
 		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageButton\").instance(0)")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text=\"Baby\"]")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator
		("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Spark the imagination!\"));")).click();
		
		driver.findElement(AppiumBy.xpath("(//androidx.compose.ui.platform.ComposeView[@resource-id=\"com.hm.goe:id/horizontal_images\"])[2]/android.view.View/android.view.View/android.widget.ImageView")).click();
		Thread.sleep(2000);
		
       WebElement eleClick = driver.findElement(AppiumBy.id("com.hm.goe:id/carouselImage"));
 		((JavascriptExecutor)driver).executeScript
 		("mobile: doubleClickGesture", ImmutableMap.of
 		("elementId", ((RemoteWebElement)eleClick).getId()));
 		
       WebElement ele = driver.findElement(AppiumBy.id("com.hm.goe:id/carouselPhotoView"));
 		
 		((JavascriptExecutor)driver).executeScript
 		("mobile: pinchOpenGesture", ImmutableMap.of
 		("elementId", ((RemoteWebElement)ele).getId(), "percent", 0.95));
 		
 		((JavascriptExecutor)driver).executeScript
 		("mobile: pinchCloseGesture", ImmutableMap.of
 		("elementId", ((RemoteWebElement)ele).getId(), "percent", 0.85));
 		
 		((JavascriptExecutor)driver).executeScript
 		("mobile: swipeGesture", ImmutableMap.of
 		("elementId",((RemoteWebElement)ele).getId(),"direction","left","percent",0.75));
 		
		driver.findElement(AppiumBy.id("com.hm.goe:id/ivCloseCarousel")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.accessibilityId("pdp_add_to_bag_new")).click();
		
	
		driver.findElement(AppiumBy.id("com.hm.goe:id/hm_shoppingbag_count")).click();
		Thread.sleep(3000);
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.view.View\").instance(5)")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"3\"));")).click();
		driver.quit();

     }
	
}