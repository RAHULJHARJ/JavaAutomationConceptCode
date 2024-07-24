package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmAssingment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://paytm.com/");
        WebElement Train = driver.findElement(By.xpath("//img[@id='Trains']"));
        Train.click();
        driver.findElement(By.xpath("//input[@id='sourceInput']")).sendKeys("Delhi");
        driver.findElement(By.xpath("(//div[@class='XXbLN'])[1]")).click();
        
        Thread.sleep(3000);
        
        
        driver.findElement(By.xpath("//input[@id='destinationInput']")).sendKeys("mumbai");
        driver.findElement(By.xpath("//inclass='_6lfK8\']")).click();
        
        
        WebElement date=driver.findElement(By.xpath("(//div[@class='Fbkn9'])[1]"));
        date.clear();
        
        
   
	}

}
