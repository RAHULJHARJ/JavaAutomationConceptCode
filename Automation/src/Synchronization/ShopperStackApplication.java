package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStackApplication {

	private static final String ExpectedConitions = null;

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://shoppersstack.com/");
        WebElement product = driver.findElement(By.xpath("//span[text()=' FAIR AND HANDSOME']"));
        product.click();
        WebElement pincode = driver.findElement(By.xpath("//input[@id='Check Delivery']"));
        pincode.sendKeys("110078");
        
        //explicit wait
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
//        wait.until(ExpectedConitions.visiblityOf(driver.findElements("//input[@autocapitalize='none']")));
//        WebElement check = driver.findElement(By.xpath("//button[@id='Check']"));
//        check.click();
	}

}
