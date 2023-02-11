package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetTheDimmensionOfWebPageElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1000);
		Dimension usernamedim = driver.findElement(By.xpath("//input[@placeholder='Username']")).getSize();
		System.out.println(dim);		
		Dimension pwddim = driver.findElement(By.xpath("//input[@placeholder='Password']")).getSize();
		System.out.println(dim1);

		int usernameheight = usernamedim.getHeight();
		int usernamewidth = pwddim.getWidth();
		
		
		
		

	}

}
