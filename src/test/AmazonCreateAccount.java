package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AmazonCreateAccount {

	 public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		driver.findElement(MobileBy.id("hmenu-customer-avatar-icon")).click();
		driver.findElement(MobileBy.id("register_accordion_header")).click();
		driver.findElement(MobileBy.id("ap_customer_name")).sendKeys("Thiru");
		driver.findElement(MobileBy.id("ap_phone_number")).sendKeys("9884467007");
		//driver.findElement(MobileBy.id("ap_email")).sendKeys("amazon@gmail.com");
		driver.findElement(MobileBy.id("ap_password")).sendKeys("testing@123");
		driver.findElement(MobileBy.id("continue")).click();
		String ActualText = driver.findElement(MobileBy.xpath("//*[@id=\"a-page\"]/div[2]/div[3]/div/div[1]/div/div/h4")).getText();
		String ExpectedText = "Mobile number already in use";
		System.out.println(ActualText);
		System.out.println(ExpectedText);
		
	
		
		
		
		
		
	}

}
