package testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class TapOnElement<AndroidElement> {

	@Test
	public void tapOnElement() throws MalformedURLException {
		
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	cap.setCapability("appPackage","io.appium.android.apis");
	cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");
	AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	//Tap on element
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	 AndroidElement view= (AndroidElement) driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Views']"));
	 AndroidTouchAction   touch = new AndroidTouchAction(driver);
	 touch.tap(TapOptions.tapOptions().withElement(ElementOption.element((WebElement) view))).perform();
	 
//	 //LongPress 
//	 LongPressOptions longpressoption = new LongPressOptions();
//	 longpressoption.withDuration(Duration.ofSeconds(5)).withElement(ElementOption.element(null))
	 
	 
	
	
	
	}
}
