package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseXpathTextFunction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		String text1 = driver.findElement(By.xpath("//td[.='Please identify yourself']")).getText();
		String text2 = driver.findElement(By.xpath("//nobr[.='actiTIME 2020 Online']")).getText();
		String text3 = driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).getText();
		System.out.println(text1);
		System.out.println(text2);
System.out.println(text3);
driver.quit();


	}

}
