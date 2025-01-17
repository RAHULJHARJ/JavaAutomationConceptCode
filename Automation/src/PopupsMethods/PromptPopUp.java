package PopupsMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		
		WebElement ConfirmationButton=driver.findElement(By.id("buttonAlert1"));
		ConfirmationButton.click();
		
		Thread.sleep(2000);
		
		Alert a=driver.switchTo().alert();
		a.sendKeys("yes");
		a.accept();

	}

}
