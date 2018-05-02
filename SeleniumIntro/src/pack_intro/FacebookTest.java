package pack_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\SeleniumWebDriver\\\\drivers\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		//xpath syntax: //tagName[@attribute='value']
//		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("triodd@yahoo.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("trioddd");
//		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//CSS selector syntax: tagName[attribute='value']
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("trioddd@yahoo.com");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("trioddd");
//		driver.findElement(By.cssSelector("input[value='Log In']")).click();
		
		//CSS selector: tagName#idValue
		driver.findElement(By.cssSelector("label#loginbutton")).click();
		
		//CSS selector: tagName.className
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("");
	}

}
