package pack_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("hello");
		driver.findElement(By.cssSelector("#password")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		driver.close();
	}

}
