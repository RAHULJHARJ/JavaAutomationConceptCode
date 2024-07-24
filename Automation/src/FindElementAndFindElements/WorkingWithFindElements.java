package FindElementAndFindElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElements {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
        WebElement Search = driver.findElement(By.xpath("//input[@name='q']"));
        Search.sendKeys("iphone",Keys.ENTER);
        List<WebElement> allProductName=driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
        List<WebElement> Price=driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
        for(int i=0;i<allProductName.size();i++) {
        	System.out.println(allProductName.get(i).getText());
        	System.out.println(Price.get(i).getText());
        
        }
	}

}
