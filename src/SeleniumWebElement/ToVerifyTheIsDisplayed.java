package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		boolean displayed = driver.findElement(By.id("email")).isDisplayed();
		
		//For Pass , We have to Use Thread Sleep for some Time
		
		
		if(displayed) {
			System.out.println("Pass: The Element is Displayed");
		}
		
		else
			System.out.println("Fail: The Element is Not Displayed");
	}

}