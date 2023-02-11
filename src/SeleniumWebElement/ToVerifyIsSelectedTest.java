package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyIsSelectedTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		boolean selected = driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if (selected) {
			System.out.println("Pass: Element is Selected");
		}
		
		else
			System.out.println("Fail: Element is Not Selected");
		Thread.sleep(2000);
		driver.quit();
	}

}
