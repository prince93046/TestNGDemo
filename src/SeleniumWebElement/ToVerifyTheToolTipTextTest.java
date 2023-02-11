package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheToolTipTextTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		String expectedToolTipText= "Do not select if this computer is shared";
		String actualToolTipText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		if(actualToolTipText.contains(expectedToolTipText)) {
			System.out.println("Pass: ");
		}
		else
			System.out.println("Fail");
		Thread.sleep(5000);
		driver.quit();

	}

}
