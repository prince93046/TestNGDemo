package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCSSValuesTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		String cssvalue = driver.findElement(By.xpath("//div[text()='Login ']")).getCssValue("border-top-color");
		System.out.println(cssvalue);

	}

}


