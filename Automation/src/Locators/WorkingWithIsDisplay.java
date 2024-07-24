package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithIsDisplay {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		WebElement Logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//img[@alt='company-branding']"))));
		System.out.println(Logo.isDisplayed());
		if(Logo.isDisplayed())
			System.out.println("Logo is displayed");
		else
			System.out.println("Logo is not displayed");

	}

}
