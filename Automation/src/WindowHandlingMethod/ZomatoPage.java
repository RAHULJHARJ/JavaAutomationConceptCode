package WindowHandlingMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com");
		
		WebElement SocialMedia=driver.findElement(By.xpath("//div[@name='Social links']"));
//		Rectangle rect=Sector29.getRect();
//		int x=rect.getX();
//		int y=rect.getY();
		
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
//		j.executeScript("window.scrollBy("+x+","+y+")");		
		j.executeScript("arguments[0].scrollIntoView(true)", SocialMedia);
		
		WebElement Linkdin=driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[1]"));
		Linkdin.click();
		Thread.sleep(2000);
		WebElement Instagram=driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[2]"));
		Instagram.click();
		Thread.sleep(2000);
		
		WebElement Tweeter=driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[3]"));
		Tweeter.click();
		Thread.sleep(2000);
		
		WebElement Youtube=driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[4]"));
		Youtube.click();
		Thread.sleep(2000);
		
		WebElement Facebook=driver.findElement(By.xpath("(//a[@class='sc-elhb8j-17 iDzUMo'])[5]"));
		Facebook.click();
		Thread.sleep(2000);
		
		Set<String>allid=driver.getWindowHandles();
		
		for(String id:allid) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("Zomato | Facebook"))
			{
				System.out.println(driver.getTitle());
			}
			else
			{
				driver.close();
			}
		}
		
	}
	

}
