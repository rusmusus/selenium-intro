package pack_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement addCity = driver.findElement(By.cssSelector("#addModifyBtn"));
		
		System.out.println("Before clicking the multi city radio button");
		System.out.println(addCity.isDisplayed());
		
		driver.findElement(By.cssSelector("label[for='switch__input_3']")).click();
		System.out.println("After clicking the culti city radio button");
		System.out.println(addCity.isDisplayed());
		
		int count = driver.findElements(By.cssSelector("label[for='switch__input_3']")).size();
		if(count == 0) {
			System.out.println("verified");
		}
		driver.close();
		
		
	}
}
