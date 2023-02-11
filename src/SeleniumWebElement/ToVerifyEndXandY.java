package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyEndXandY {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("file:///D:/software/Qspider_Selenium/qspiderhtml.html");
		Rectangle usernameRect = driver.findElement(By.id("abc")).getRect();
		Rectangle pwdRect = driver.findElement(By.id("cdf")).getRect();
		
		int passwordStartX = pwdRect.getX();
		int usernameWidth = pwdRect.getWidth();
		int usernameEndX = passwordStartX + usernameWidth;
		
		int passwordStartX=pwdRect.getX();
		
	}

}
