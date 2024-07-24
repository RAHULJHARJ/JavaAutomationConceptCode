package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		//Create the object of action class
		Actions a=new Actions(driver);
		
		WebElement circle=driver.findElement(By.id("circle"));
		
		a.clickAndHold(circle).perform();
		
		Thread.sleep(2000);
		a.release().perform();

	}

}
