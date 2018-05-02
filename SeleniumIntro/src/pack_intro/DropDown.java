package pack_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com/");
		driver.manage().window().maximize();
		
		//Select class for static dropdowns
		Select select = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		select.selectByValue("2");
		select.selectByIndex(6);
		select.selectByVisibleText("5");
		
		//dynamic dropdowns
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click(); //second instance web element
	}

}
