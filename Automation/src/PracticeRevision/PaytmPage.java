package PracticeRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmPage {

	private static WebElement search;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapps.qspiders.com/");
		
		WebElement Ui=driver.findElement(By.xpath("//p[text()='UI Testing Concepts']"));
		Thread.sleep(2000);
		Ui.click();
		
		WebElement Name=driver.findElement(By.id("name"));
		String av=search.getCssValue("class");
		System.out.println(av);
		
		

	}

}
