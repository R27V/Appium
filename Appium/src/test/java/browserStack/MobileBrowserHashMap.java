package browserStack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class MobileBrowserHashMap {

	public static final String userName ="renuverma_tafrsC";
	public static final String accessKey ="Wy6q1RD4NCvas5XNTnvx";
	public static final String url ="https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void mobileBrowser() throws Throwable
	{
		MutableCapabilities mc = new MutableCapabilities();
		HashMap<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("browserName", "chrome");
		hMap.put("deviceName", "Samsung Galaxy S22");
		hMap.put("realMobile", true);
		hMap.put("os_version", "12.0");
		
		mc.setCapability("bsatck:option", hMap);
		
		WebDriver driver = new RemoteWebDriver(new URL(url), mc);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
	
}
