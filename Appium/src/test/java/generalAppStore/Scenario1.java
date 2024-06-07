package generalAppStore;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.emulation.model.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Scenario1 {

	@Test
	public void login() throws Throwable
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
 		
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		
 		//Launch the app
 		driver.activateApp("com.androidsample.generalstore");
 		
 		//Select India as country
 		driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
 		
 		driver.findElement(AppiumBy.androidUIAutomator
 		("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
 		
 		// Enter Name
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("Ramya");
        
        //Select Gender
 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioFemale")).click();
 	    
 	    //Click on Let's Shop button
 	    driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
 	    
 	    Thread.sleep(2000);
 	    //get the current activity of products page
 	    System.out.println(driver.currentActivity()); //O/p - .AllProductsActivity
 	    
 	   Thread.sleep(2000);
 	    //Screen Orientation change to landscape
 	    org.openqa.selenium.ScreenOrientation screen = driver.getOrientation();
	    driver.rotate(screen.LANDSCAPE);
//        
        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
        
    //    Thread.sleep(2000);
 	   String popUp = driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.Toast")).getText();
 	    System.out.println(popUp);
 	
	}
}
