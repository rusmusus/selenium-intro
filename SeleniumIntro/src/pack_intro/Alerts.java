package pack_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
//		driver.switchTo().alert().accept();  //Accept = ok, yes, accept, agree
		driver.switchTo().alert().dismiss(); //Dismiss = cancel, no, disagree
		
		//if there is an edit box/input field on an alert you can use sendKeys() method
//		driver.switchTo().alert().sendKeys("xxx");
		
	}

}
