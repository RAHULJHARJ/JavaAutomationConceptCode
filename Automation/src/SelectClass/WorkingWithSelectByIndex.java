package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithSelectByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com");
		
		//Click on create new sccount
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		
		//identify the month dropDown
		WebElement Dropdown=driver.findElement(By.id("month"));
		
		//Creat the object of selectClass
		Select s=new Select(Dropdown);
		
		//use the methods
		for(int i=0;i<12;i++) {
			s.selectByIndex(i);
			Thread.sleep(2000);
		}

	}

}
