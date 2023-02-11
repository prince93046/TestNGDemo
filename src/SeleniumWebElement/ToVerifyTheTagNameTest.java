package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheTagNameTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		String actualUsernameTag = driver.findElement(By.id("username")).getTagName();
		String actualPasswordTag = driver.findElement(By.name("pwd")).getTagName();
		String actualLoginTag = driver.findElement(By.xpath("//div[text()='Login ' ]")).getTagName();
		System.out.println(actualUsernameTag);
		System.out.println(actualPasswordTag);
		System.out.println(actualLoginTag);
		
		if(actualUsernameTag.equals("input")) {
			driver.findElement(By.id("username")).sendKeys("admin");
		}
		if(actualPasswordTag.equals("input")) {
			driver.findElement(By.name("pwd")).sendKeys("manager");

		}
		else
			System.out.println("Login is incomplete, one of the tags are not matching");
			

		
		

	}

}
