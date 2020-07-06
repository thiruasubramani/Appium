package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstMobileTesting {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Thiru");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Thiru");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\THIRUNAVUKKARASUSUBR\\Desktop\\Encyclopedia\\Selenium\\chromedriver.exe");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://googl.com");
		driver.findElement(By.xpath("//input[@name ='q']")).sendKeys("Selenium");
	}

}
