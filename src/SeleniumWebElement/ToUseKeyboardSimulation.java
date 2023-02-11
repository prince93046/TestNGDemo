package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseKeyboardSimulation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(1000);

	/*	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Keys.ENTER); */





	}

}
