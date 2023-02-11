package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathnContainFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		String text1 = driver.findElement(By.xpath("//td[contains(@']")).getText();
		String text2 = driver.findElement(By.xpath("//nobr[.='actiTIME 2020 Online']")).getText();
		String text3 = driver.findElement(By.xpath("[//a.='actiTIME Inc.']")).getText();
		System

	}

}
