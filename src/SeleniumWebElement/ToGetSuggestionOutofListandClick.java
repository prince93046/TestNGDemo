package SeleniumWebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetSuggestionOutofListandClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Timeouts timeout = driver.manage().timeouts();
		timeout.implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("selenium");
		
		List<WebElement> autoSuggetion = driver.findElements(By.xpath("//span[text()='selenium']"));
		System.out.println("The no. of AutoSuggetions are: "+autoSuggetion.size());
		for(WebElement suggestion:autoSuggetion) {
			if(suggestion.getText().equals("selenium python")) {
				suggestion.click();
				break;
			}

	}

}


}

	
		
















