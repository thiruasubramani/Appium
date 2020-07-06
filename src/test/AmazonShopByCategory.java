package test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonShopByCategory {

	public static void main(String[] args) throws IOException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Thiru");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Thiru");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\THIRUNAVUKKARASUSUBR\\Desktop\\Encyclopedia\\Selenium\\chromedriver.exe");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(MobileBy.id("nav-hamburger-menu")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[6]/a")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"sbdCategory2\"]/div[1]/div[2]/span")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"sbdCategory2\"]/div[2]/div/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"configuration-button\"]/span/input")).click();
		driver.findElement(MobileBy.xpath("//*[@id=\"configuration_1\"]/span/input")).click();
		driver.findElement(MobileBy.xpath("//*[@class = 'a-sheet-close a-focus-hidden']")).click();
		driver.findElement(MobileBy.id("sfl-button")).click();
		
		
	}

}
