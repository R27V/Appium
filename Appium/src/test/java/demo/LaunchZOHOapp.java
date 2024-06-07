package demo;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LaunchZOHOapp {

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
		
		dc.setCapability("appPackage", "com.zoho.crm");
		dc.setCapability("appActivity", ".module.ui.CRMMainScreen");
		
		
		

		//setting url for appium server
		URL url = new URL("http://localhost:4723");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		driver.activateApp("com.zoho.crm.module.ui.CRMMainScreen");
		Thread.sleep(2000);
		driver.findElement(AppiumBy.id("com.zoho.crm:id/button_sign_in")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("vermarenu007@gmail.com");
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Next\"]")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("Renuverma27$");
		driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign in\"]")).click();
		
	}
}
