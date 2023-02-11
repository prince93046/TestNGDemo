package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheIsEnabledTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("manojsi@gmail.com");
		Thread.sleep(3000);
		boolean enabled = driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).isEnabled();
		if (enabled) {
			System.out.println("Pass: Button is Selected");
		}
		
		else
			System.out.println("Fail: Button is Not Selected");
		Thread.sleep(2000);
		driver.quit();

	}

}
