package pack_intro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.alaskaair.com/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#tab-hotels")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='hotelOnlyToLocation']")).sendKeys("nyc");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[citycode='6139058']")));
		driver.findElement(By.xpath("//input[@id='hotelOnlyToLocation']")).sendKeys(Keys.TAB);
		
		driver.findElement(By.id("hotelFromDate")).sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-opt-group='Price']")));
		driver.findElement(By.cssSelector("button[data-opt-group='Price']")).click();
		
//		driver.quit();
		
	}

}
