package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssingmentInstagram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		WebElement UserNameTextField=driver.findElement(By.xpath("//input[@maxlength='75']"));
		UserNameTextField.sendKeys("rahuljha14012002@gmail.com",Keys.ENTER);
		WebElement PasswordTextField=driver.findElement(By.xpath("//input[@type='password']"));
		PasswordTextField.sendKeys("Gopagal@123",Keys.ENTER);
	}

}
