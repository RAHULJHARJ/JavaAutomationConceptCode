package JavaScriptMrthods;

import java.lang.classfile.WritableElement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecuter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com");
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		
		for(int i=0;i<2;i++) {
			j.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(2000);
		}
		for(int i=0;i<2;i++) {
			j.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(2000);
	}
		Actions a=new Actions(driver);
		WebElement Privacy=(WebElement) driver.findElements(By.linkText("Privacy"));
		a.moveToElement((WebElement) Privacy).perform();
		Privacy.click();
		
	}
}
