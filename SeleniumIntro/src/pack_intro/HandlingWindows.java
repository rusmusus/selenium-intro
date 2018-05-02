package pack_intro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/sl/pwd?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[.='Help']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> iterateID = ids.iterator();
		String parentID = iterateID.next();
		String childID = iterateID.next();
		
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		Thread.sleep(5000);
//		driver.close();
		driver.quit();
		
		
	}

}
