package SeleniumWebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);

	}

}
