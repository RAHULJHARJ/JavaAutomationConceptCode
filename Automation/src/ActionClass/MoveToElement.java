package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://paytm.com/");
		
		//Create the object of action class
		Actions a=new Actions(driver);
		
		//identify the webElement where you want to move your mouse cursor
		
		WebElement pfc=driver.findElement(By.linkText("Paytm for Consumer"));
		
		//use moveToElementMethod
		
		a.moveToElement(pfc).perform();

	}

}
