package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//identify the email text field and enter phone
		WebElement usernameTextField=driver.findElement(By.name("email"));
		usernameTextField.sendKeys("7970992840");
		

	}

}
