package scriptsGivenByPrakashSir;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Flipkartphone {

	@Test
	public void capturePhonesList() throws MalformedURLException, InterruptedException
	{

		DesiredCapabilities dc = new DesiredCapabilities();
 		dc.setCapability("platformName", "Android");
 		dc.setCapability("automationName", "uiAutomator2" );
 		dc.setCapability("deviceName", "OnePlusNordCE3");
 		dc.setCapability("UDID", "5f65e6e6");
 		dc.setCapability("browserName", "chrome");
 		dc.setCapability("noReset", true);
 		dc.setCapability("ignoreHiddenApiPolicyError", true);
 		dc.setCapability("autoGrantPermission", true);
// 		dc.setCapability("appPackage", "com.android.chrome");
// 		dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
 		
 		URL url = new URL("http://localhost:4723");
 		AndroidDriver driver = new AndroidDriver(url,dc);
 		
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
 		driver.get("https://www.flipkart.com/");
 		
//		String phoneText="";
//		String priceText="";
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//div[text()='Search for Products, Brands and More']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone15",Keys.ENTER);
		//ArrayList<String> list= new ArrayList<String>();
		List<WebElement> phonesName = driver.findElements(By.xpath("//div[@class='css-1rynq56 r-8akbws r-krxsd3 r-dnmrzs r-1udbk01']"));
		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='css-1rynq56 r-8akbws r-krxsd3 r-dnmrzs r-1udbk01']/../..//div[contains(text(),'₹')]"));
//	
//		TreeMap<String, String> map= new TreeMap<String, String>();	
//		for (WebElement eachName : phonesName) 
//		{	 
//			for (WebElement eachPrice : price) {
//				phoneText = eachName.getText();
//				 priceText = eachPrice.getText();
//		//		 System.out.println(phoneText+" "+priceText);
//				 
//				 for (int i = 0; i < phoneText.length(); i++) {
//						map.put(phoneText,priceText );
//					}
//					System.out.println(map);
//			}			
//		}
		
		
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class='_2SmNnR']/input")).sendKeys("iphone 15",Keys.ENTER);
//		List<WebElement> l = driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='KzDlHZ']"));
//		List<WebElement> p = driver.findElements(By.xpath("//div[@class='hl05eU']/div[@class='Nx9bqj _4b5DiR']"));
		//		HashSet<String> st = new HashSet<String>();
		//		HashSet<String> si = new HashSet<String>();
		TreeMap<String, String> hm = new TreeMap<String, String>();
		for (int i = 0; i < phonesName.size(); i++) {
			String phone = phonesName.get(i).getText();
			String price = prices.get(i).getText();
			hm.put(phone, price);
		}
		
		for(String s : hm.keySet()) {
			System.out.println(s+" "+hm.get(s));
		}
		System.out.println("----------");
		for(String s : hm.descendingKeySet()) {
			System.out.println(s+" "+hm.get(s));
		}
		
		
		
	}
}
