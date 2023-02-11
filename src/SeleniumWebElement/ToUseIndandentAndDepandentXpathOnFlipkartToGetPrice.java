package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIndandentAndDepandentXpathOnFlipkartToGetPrice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/search?q=iphone+12&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_2_6_na_na_na&as-pos=2&as-type=RECENT&suggestionId=iphone+12%7CMobiles&requestId=9122554b-0359-4145-a1b2-0b4d9ca46c0a&as-searchtext=iphone");
	//	String text = driver.findElement(By.xpath("//div[.='APPLE iPhone 12 (Green, 128 GB)']/../..//div[.='₹64,999']")).getText();
		String productName="APPLE iPhone 12 (White, 64 GB)";
		String price="₹59,999";
		
		String text = driver.findElement(By.xpath("//div[.='"+productName+"']/../..//div[.='"+price+"']")).getText();

		System.out.println(text);
		Thread.sleep(1000);
		driver.quit();
		
		

	}

}
