package WindowHandlingMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		WebElement Search=driver.findElement(By.name("q"));
		
		Search.sendKeys("Iphone",Keys.ENTER);
		
		WebElement FirstProduct=driver.findElement(By.xpath("(//div[@class='tUxRFH'])[1]"));
		FirstProduct.click();
		
		String parent=driver.getWindowHandle();
		System.out.println("parent id"+ parent);
		
		Set<String> allid=driver.getWindowHandles();
		
		for(String id:allid) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Apple iPhone 15 (Green, 128 GB)")) {
				break;
				
			}
		}
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		
		String child=driver.getWindowHandle();
		System.out.println("child id"+ child);
		
	}

}
