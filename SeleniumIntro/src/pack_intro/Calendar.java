package pack_intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		
		//clicking on a specific date
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
		WebElement months = driver.findElement(By.xpath("//*[@class='datepicker-switch'][1]"));
		
		while(!months.getText().contains("May")) {
			driver.findElement(By.cssSelector("[class = 'datepicker-days'] th[class = 'next']")).click();
		}
		
		List<WebElement> dates = driver.findElements(By.className("day"));
		int count = driver.findElements(By.className("day")).size();
		
		for(int i = 0; i < count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equals("23")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
	}

}
