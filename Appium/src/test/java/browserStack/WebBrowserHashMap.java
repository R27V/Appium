package browserStack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class WebBrowserHashMap {

	public static final String userName ="renuverma_tafrsC";
	public static final String accessKey ="Wy6q1RD4NCvas5XNTnvx";
	public static final String url ="https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub";
	
	@Test
	public void webBrowser() throws Throwable
	{
		ChromeOptions option = new ChromeOptions();
		option.setPlatformName("windows 11");
		option.setBrowserVersion("latest");
		
		HashMap<String, Object> hMap = new HashMap<String, Object>();
		hMap.put("build", "selenium_build");
		hMap.put("name", "WebBrowser");
		
		option.setCapability("sauce:options", hMap);
		
		WebDriver driver = new RemoteWebDriver(new URL(url), option);
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
}
