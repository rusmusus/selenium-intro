package practice_ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ebay.com");
		driver.manage().window().maximize();
		
		//count of the links on the entire page
		int numberLinks = driver.findElements(By.tagName("a")).size();
		System.out.println(numberLinks);
		
		//count of links in the footer section of the link
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		int numLinkFooter = footer.findElements(By.tagName("a")).size();
		System.out.println(numLinkFooter);
		
		WebElement column2 = driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[2]/ul"));
		int numLinkCol2 = column2.findElements(By.tagName("a")).size();
		System.out.println(numLinkCol2);
		
		for(int i = 0; i < numLinkCol2; i++) {
			String linkName = column2.findElements(By.tagName("a")).get(i).getText();
			System.out.println(linkName);
			
			if(linkName.equals("Site map")) 
			{
				System.out.println(linkName);
				WebElement lastLink = column2.findElements(By.tagName("a")).get(i);
				lastLink.click();
				
				System.out.println(driver.getTitle());
			}
		}
		
//		driver.close();
	}

}
