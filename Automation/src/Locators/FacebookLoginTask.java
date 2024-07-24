package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		WebElement usernameTextField=driver.findElement(By.name("email"));
		usernameTextField.sendKeys("7970992840");
		WebElement password=driver.findElement(By.name("pass"));
		password.sendKeys("Gopagal@123");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		WebElement ForgetPassword=driver.findElement(By.linkText(""));
		ForgetPassword.click();
		
	}

}
