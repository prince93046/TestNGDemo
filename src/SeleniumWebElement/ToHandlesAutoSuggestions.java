package SeleniumWebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlesAutoSuggestions {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.get("https://www.google.com/");
			driver.findElement(By.name("q")).sendKeys("selenium");
			Thread.sleep(1000);
			List<WebElement> autoSuggetion = driver.findElements(By.xpath("//span[text()='selenium']"));
			System.out.println("The no. of AutoSuggetions are: "+autoSuggetion.size());
			for(WebElement suggestion:autoSuggetion) {
				System.out.println(suggestion.getText());
				
			}
				
			

	}

}
