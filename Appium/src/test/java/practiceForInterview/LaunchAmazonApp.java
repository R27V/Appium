package practiceForInterview;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LaunchAmazonApp {

	@Test
	public void launchApp() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "Android");
		dc.setCapability("automationName", "uiAutomator2");
		dc.setCapability("deviceName", "OnePlusNordCE3");
		dc.setCapability("UDID", "5f65e6e6");
		dc.setCapability("noReset", true);
		dc.setCapability("ignoreHiddenApiPolicyError", "true");
		dc.setCapability("autoGrantPermissions", true);
		dc.setCapability("appWaitActivity", "*");
		
//		dc.setCapability("appPackage", "in.amazon.mShop.android.shopping");
//		dc.setCapability("appActivity", "com.amazon.mShop.navigation.MainActivity");
		
        URL url = new URL("http://localhost:4723");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.activateApp("in.amazon.mShop.android.shopping");
		
		
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.id("in.amazon.mShop.android.shopping:id/chrome_search_hint_view")).click();
		Thread.sleep(2000);
		
		driver.findElement(AppiumBy.id("in.amazon.mShop.android.shopping:id/rs_search_src_text")).sendKeys("Kurti"+Keys.ENTER);
		
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"kurti for women\"]")).click();
		
		driver.findElement(AppiumBy.className("android.widget.Button")).click();
				
	}
}
