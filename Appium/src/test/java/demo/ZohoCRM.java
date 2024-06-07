package demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ZohoCRM {

	
	public static final String userName ="renuverma_tafrsC";
	public static final String accessKey ="Wy6q1RD4NCvas5XNTnvx";
	public static final String url ="https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
	public void launchApp() throws MalformedURLException {
		
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("os_version", "13.0");
	dc.setCapability("deviceName", "Samsung Galaxy S23");
	dc.setCapability("app", "bs://a5d9ddb55dbacb35b4482ac7d139fa957f17beb2");
	dc.setCapability("project", "AppiumMock");
	dc.setCapability("build", "build 1.1");
	dc.setCapability("name", "ZohoCRM");
	
	AndroidDriver driver = new AndroidDriver(new URL(url),dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	
	driver.findElement(AppiumBy.id("com.zoho.crm:id/button_sign_in")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.EditText\").instance(0)")).sendKeys("vermarenu007@gmail.com");
	driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Next\"]")).click();
	driver.findElement(AppiumBy.className("android.widget.EditText")).sendKeys("Renuverma27$");
	driver.findElement(AppiumBy.xpath("//android.widget.Button[@text=\"Sign in\"]")).click();
	
	
	}
}
