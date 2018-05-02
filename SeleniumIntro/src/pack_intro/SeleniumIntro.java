package pack_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumIntro {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumWebDriver\\drivers\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\SeleniumWebDriver\\drivers\\MicrosoftWebDriver.exe");
		
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new FirefoxDriver();
//		WebDriver driver = new InternetExplorerDriver();
		
//		driver.get("http://amazon.com");
//		driver.get("http://google.com");
//		driver.navigate().back();
//		driver.navigate().forward();
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle()); //validating if the page title is correct
		System.out.println(driver.getCurrentUrl()); //validating the correct url
		
		
		
//		driver.close();  // closes the current browser window
//		driver.quit();   // closes all the browser windows opened by selenium scripts
		

	}
}
