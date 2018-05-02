package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCalendar {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.cssSelector("label[for='onward_cal']")).click();
//		Thread.sleep(3000);
		
//		List<WebElement> dates = driver.findElements(By.cssSelector("div[id='rb-calendar_onward_cal']/table[1]//td/"));
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table[1]//td/"));
		
		int numDates = dates.size();
		
		for(int i = 0; i < numDates; i++) {
			String date = dates.get(i).getText();
			
			if(date.equalsIgnoreCase("31")) {
				dates.get(i).click();
				break;
			}
		}
	}

}
