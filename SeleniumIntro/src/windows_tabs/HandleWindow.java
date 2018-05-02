package windows_tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindow {
	
	@Test
	public void handleWindow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.in/2017/07/multiple-window-examples.html");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is "+parent);
		driver.findElement(By.xpath("//a[contains(@href, 'http://www.google.com')]")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		int count = allWindows.size();
		
		System.out.println("Total windows count is: "+count);
		
		for(String child: allWindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println("Parent window title is "+driver.getTitle());
	}

}
