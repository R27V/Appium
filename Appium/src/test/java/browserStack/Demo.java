package browserStack;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Demo {

	
	public static final String userName ="renuverma_tafrsC";
	public static final String accessKey ="Wy6q1RD4NCvas5XNTnvx";
	public static final String url ="https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	@Test
	public void demo1() throws MalformedURLException {
		
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setCapability("os_version", "13.0");
	dc.setCapability("deviceName", "Samsung Galaxy S23");
	dc.setCapability("app", "bs://87bbd0612c27cc15338f69954061d7c2e5d582a0");
	dc.setCapability("project", "Appium");
	dc.setCapability("build", "build 1.2");
	dc.setCapability("name", "demo");
	
	AndroidDriver driver = new AndroidDriver(new URL(url),dc);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Ram");
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")).click();
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnProceed")).click();
	
	
	}
	
}
