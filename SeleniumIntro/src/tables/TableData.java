package tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableData {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/cricket-series/2656/pakistan-super-league-2018/points-table");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col-67 cb-col cb-left cb-hm-rght']"));
		int rowNum = table.findElements(By.cssSelector("cb-col-67 cb-col cb-left cb-hm-rght")).size();
		int count = table.findElements(By.cssSelector("div[class='cb-col-67 cb-col cb-left cb-hm-rght'] div:nth-child(6)")).size();
		
		for(int i = 0; i < count; i++) {
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col-67 cb-col cb-left cb-hm-rght'] div:nth-child(6)")).get(i).getText());
		}
		
		
		
		
	}
}
