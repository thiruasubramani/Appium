package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class UdemyCourseSubscription {

	public static void main(String[] args) throws Exception {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Thiru");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Thiru");
		cap.setCapability(MobileCapabilityType.NO_RESET, false);
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.udemy.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.udemy.android.SplashActivity");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Browse\")")).click();
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search all courses\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Search all courses\")")).sendKeys("Selenium");
		driver.hideKeyboard();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"selenium\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Selenium WebDriver with Java -Basics to Advanced+Frameworks\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"ADD TO CART\")")).click();
		
	}

	}


