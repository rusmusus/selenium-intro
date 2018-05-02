package pack_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//moves mouse to a specific web element and hover over that element
		action.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		Thread.sleep(5000);
		
		WebElement search = driver .findElement(By.cssSelector("#twotabsearchtextbox"));
		action.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("java books").doubleClick().build().perform();
		
		Thread.sleep(10000);
		driver.close();
	}

}
