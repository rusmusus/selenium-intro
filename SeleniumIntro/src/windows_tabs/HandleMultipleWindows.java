package windows_tabs;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleMultipleWindows {

	@Test
	public void handleWindow() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rusmusus/Documents/Libraries/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.naukri.com/");
		String parent = driver.getWindowHandle();
		System.out.println("Parent window id is " + parent);

		Set<String> allWindows = driver.getWindowHandles();

		int count = allWindows.size();

		System.out.println("Total windows count is: " + count);

		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("Child window title is " + driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
		}

		driver.switchTo().window(parent);
		System.out.println("Parent window title is " + driver.getTitle());
		driver.close();
	}

}
