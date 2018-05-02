package pack_intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebDriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement radioButter = driver.findElement(By.xpath("//input[@value='Butter']"));
		WebElement radioMilk = driver.findElement(By.xpath("//input[@value='Milk']"));
		WebElement radioMilk2 = driver.findElement(By.xpath("(//input[@name='group1'])[1]"));
		
		
//		if(!radioButter.isSelected()) {
//			radioButter.click();
//			System.out.println(radioButter.isSelected());
//		}else {
////			radioMilk.click();
//			radioMilk2.click();
//			System.out.println(radioMilk.isSelected());
//		}
		
		int radioCount = driver.findElements(By.xpath("//input[@name='group1']")).size();
		System.out.println(radioCount);
		
		for(int i = 0; i < radioCount; i++) {
//			driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			String value = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(value);
			
			if(value.equals("Cheese")) {
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}
		
		
	}

}
