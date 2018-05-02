package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollIntoView {
	
	@Test
	public void scrolling() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		
		//create an instance of Javascript executor
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		//identify the WebElement which will appear after scrolling down
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		
		//execute query which will actually scroll until that element is not appeared on page
		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		//extract the text and verify
		System.out.println(element.getText());
		
	}
	
	

}
