package PopupsMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
			
			WebElement ConfirmationButton=driver.findElement(By.id("buttonAlert5"));
			ConfirmationButton.click();
			
			Thread.sleep(2000);
			
			Alert a=driver.switchTo().alert();
			a.accept();

	}

}
