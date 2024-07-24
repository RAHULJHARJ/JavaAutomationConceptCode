package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFrams {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		driver.switchTo().frame(0);
		WebElement Mobile=driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));
		Mobile.sendKeys("7970992840");
		
		
	}

}
