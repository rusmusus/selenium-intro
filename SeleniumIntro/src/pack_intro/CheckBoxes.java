package pack_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		
		// isSelected() method
		WebElement checkStudent = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		
		System.out.println(checkStudent.isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(checkStudent.isSelected());
		
	}

}
