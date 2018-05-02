package windows_tabs;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleWindowsArrayList {
	
	@Test
	public void handleWindow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is "+parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		ArrayList<String> tabs = new ArrayList<>(allWindows); 
		driver.switchTo().window(tabs.get(2));
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		driver.close();
		
	}

}
