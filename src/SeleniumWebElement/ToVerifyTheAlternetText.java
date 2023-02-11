package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheAlternetText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		String expectedAlternetText= "Flipkart";
		String actualAlternetText = driver.findElement(By.className("_2xm1JU")).getAttribute("alt");
		if(actualAlternetText.contains(expectedAlternetText)) {
			System.out.println("Pass: ");
		}
		else
			System.out.println("Fail");
		Thread.sleep(5000);
		}
		

	}


